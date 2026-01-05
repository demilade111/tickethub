-- Create events table
CREATE TABLE IF NOT EXISTS events (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(300) NOT NULL,
    description VARCHAR(5000) NOT NULL,
    artist_name VARCHAR(200),
    event_date_time TIMESTAMP NOT NULL,
    end_date_time TIMESTAMP,
    price NUMERIC(10, 2) NOT NULL,
    total_tickets INTEGER NOT NULL,
    available_tickets INTEGER NOT NULL,
    image_url VARCHAR(500),
    status VARCHAR(50) NOT NULL DEFAULT 'DRAFT',
    category VARCHAR(50) NOT NULL,
    venue_id BIGINT NOT NULL,
    created_by_user_id BIGINT NOT NULL,
    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT fk_events_venue FOREIGN KEY (venue_id) REFERENCES venues(id),
    CONSTRAINT fk_events_created_by FOREIGN KEY (created_by_user_id) REFERENCES users(id),
    CONSTRAINT chk_events_total_tickets CHECK (total_tickets > 0),
    CONSTRAINT chk_events_available_tickets CHECK (available_tickets >= 0),
    CONSTRAINT chk_events_price CHECK (price >= 0)
);

CREATE INDEX IF NOT EXISTS idx_events_status ON events(status);
CREATE INDEX IF NOT EXISTS idx_events_category ON events(category);
CREATE INDEX IF NOT EXISTS idx_events_event_date_time ON events(event_date_time);
CREATE INDEX IF NOT EXISTS idx_events_venue_id ON events(venue_id);
CREATE INDEX IF NOT EXISTS idx_events_created_by_user_id ON events(created_by_user_id);

