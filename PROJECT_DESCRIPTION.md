# 📋 CLAUDE PROJECT DESCRIPTION - TICKETHUB EVENT TICKETING PLATFORM

**Copy this entire document into your Claude Project Knowledge base**

---

## 🎯 PROJECT OVERVIEW

### **Project Name:** TicketHub - Cloud-Native Event Ticketing Platform

### **Developer:** Junior/Mid-Level Backend Engineer (Learning Project)

### **Primary Goal:**

Build a production-grade, scalable ticketing platform to demonstrate full-stack backend development, distributed systems knowledge, and DevOps capabilities for job applications.

### **Target Outcome:**

- Complete portfolio project showcasing modern tech stack
- Deployable on AWS with Kubernetes
- Demonstrates ability to handle complex distributed systems challenges
- Ready for technical interviews by February 2025

### **Project Type:**

Real-world business application (not a tutorial project) that solves actual technical challenges including concurrency control, payment processing, and cloud deployment.

---

## 🏗️ WHAT WE'RE BUILDING

### **Business Domain:**

An event ticketing platform similar to Ticketmaster/Eventbrite where:

- Event organizers can create and manage events
- Customers can browse, search, and book tickets
- System prevents double-booking through distributed locking
- Payments are processed securely via Stripe
- Email confirmations are sent automatically
- System scales to handle high concurrent traffic

### **Core Problem We're Solving:**

The **inventory management problem under concurrent load** - preventing multiple users from booking the same ticket simultaneously while maintaining high throughput and system availability.

### **Technical Complexity:**

This is NOT a simple CRUD application. We're building a **distributed state machine** with:

- Race condition prevention (distributed locking)
- Financial transaction integrity
- Asynchronous processing
- High availability architecture
- Production-grade security

---

## 🛠️ COMPLETE TECHNOLOGY STACK

### **Backend Framework:**

- **Java 17** (LTS version, modern features)
- **Spring Boot 3.x** (Industry-standard framework)
- **Spring Security** (Authentication & Authorization)
- **Spring Data JPA** (Database ORM)
- **Spring Web** (REST API)
- **Maven** (Dependency management & build tool)

### **Databases:**

- **PostgreSQL 15** (Primary relational database, AWS RDS)
  - ACID compliance for transactional integrity
  - Complex queries and relationships
  - JSON support for flexible data
- **Redis 7** (In-memory data store, AWS ElastiCache)
  - Distributed locking (prevent race conditions)
  - Caching (performance optimization)
  - Session management
  - TTL-based key expiration

### **Message Queue (Future Enhancement):**

- **Apache Kafka** or **AWS SQS** (To be added later)
  - Asynchronous event processing
  - Email notification queuing
  - Event-driven architecture
  - Decoupling services
  - **Note:** Not in MVP, but architecture will support easy integration

### **Authentication & Security:**

- **JWT (JSON Web Tokens)** - Stateless authentication
- **BCrypt** - Password hashing (cost factor 12)
- **Spring Security** - Method-level authorization
- **HTTPS/TLS** - Encrypted communication
- **AWS Secrets Manager** - Secure credential storage

### **Payment Processing:**

- **Stripe API** (Payment gateway)
  - Payment Intents API
  - Webhook handling for async confirmation
  - Test mode for development
  - PCI-compliant integration

### **Email Service:**

- **SendGrid** or **AWS SES** (Transactional emails)
  - Booking confirmations
  - Event reminders
  - Cancellation notifications
  - HTML templates (Thymeleaf)

### **Containerization:**

- **Docker** - Application containerization
- **Docker Compose** - Multi-container local development
- **Multi-stage Dockerfile** - Optimized image size

### **Orchestration:**

- **Kubernetes** - Container orchestration
  - AWS EKS (Elastic Kubernetes Service)
  - Deployments, Services, ConfigMaps, Secrets
  - Horizontal Pod Autoscaling (HPA)
  - Rolling updates with zero downtime
  - Self-healing and health checks

### **Infrastructure as Code:**

- **Terraform** - Cloud infrastructure provisioning
  - AWS EKS cluster creation
  - RDS database provisioning
  - ElastiCache Redis setup
  - VPC, subnets, security groups
  - S3 buckets for storage
  - IAM roles and policies
  - State management (S3 backend)
  - **Why Terraform:**
    - Reproducible infrastructure
    - Version control for cloud resources
    - Multi-environment support (dev/staging/prod)
    - Industry standard IaC tool

### **CI/CD:**

- **GitHub Actions** - Automated pipeline
  - Build (Maven compile & package)
  - Test (JUnit, integration tests)
  - Security scan (OWASP Dependency Check)
  - Docker image build & push to ECR
  - Deploy to Kubernetes (staging → production)
  - Rollback on failure

### **Cloud Provider (AWS Services):**

- **EKS** - Managed Kubernetes
- **RDS** - Managed PostgreSQL
- **ElastiCache** - Managed Redis
- **ECR** - Docker container registry
- **S3** - Object storage (images, QR codes, backups)
- **CloudWatch** - Logging and monitoring
- **ALB** - Application Load Balancer
- **VPC** - Network isolation
- **IAM** - Identity and access management
- **Secrets Manager** - Secure credential storage
- **Certificate Manager** - SSL/TLS certificates

### **Monitoring & Observability:**

- **AWS CloudWatch**
  - Application logs aggregation
  - Metrics collection (requests, latency, errors)
  - Custom business metrics (bookings/min, revenue)
  - Alarms and notifications
- **Spring Boot Actuator** - Health checks, metrics endpoints
- **Micrometer** - Metrics instrumentation
- **(Future) Prometheus + Grafana** - Advanced monitoring dashboards

### **API Documentation:**

- **Swagger/OpenAPI 3.0** (Springdoc)
  - Auto-generated interactive API docs
  - Request/response examples
  - Try-it-out functionality

### **Testing:**

- **JUnit 5** - Unit testing
- **Mockito** - Mocking dependencies
- **Spring Boot Test** - Integration testing
- **Testcontainers** - Database testing with real PostgreSQL
- **JaCoCo** - Code coverage reporting (target: 70%+)

### **Development Tools:**

- **IntelliJ IDEA** or **VS Code** - IDE
- **Postman** - API testing
- **Git & GitHub** - Version control
- **Docker Desktop** - Local container runtime
- **kubectl** - Kubernetes CLI
- **AWS CLI** - AWS command-line interface
- **Terraform CLI** - Infrastructure management

---

## 📚 LEARNING OBJECTIVES & SKILLS ACQUIRED

### **Backend Development Skills:**

- Building RESTful APIs with Spring Boot
- Database design (entities, relationships, normalization)
- JPA/Hibernate ORM
- Transaction management (@Transactional)
- Concurrency control (pessimistic locking, distributed locks)
- Input validation and error handling
- Exception handling with @ControllerAdvice
- DTO pattern (Data Transfer Objects)
- Service layer pattern
- Repository pattern
- Asynchronous processing (@Async)
- Third-party API integration (Stripe, SendGrid)
- Webhook handling and idempotency

### **Security Skills:**

- Authentication (JWT token generation and validation)
- Authorization (role-based access control)
- Password hashing (BCrypt)
- HTTPS/TLS configuration
- CORS configuration
- Rate limiting
- SQL injection prevention
- XSS protection
- Secure credential management

### **Database Skills:**

- PostgreSQL administration
- Schema design and migrations (Flyway/Liquibase)
- Indexing strategies for performance
- Complex SQL queries and JOINs
- Query optimization (EXPLAIN ANALYZE)
- Transaction isolation levels
- Database connection pooling (HikariCP)

### **Distributed Systems Skills:**

- Race condition identification and prevention
- Distributed locking with Redis
- CAP theorem understanding (consistency vs availability)
- Idempotency patterns
- Eventual consistency
- Caching strategies (cache-aside, write-through)
- Cache invalidation
- TTL (time-to-live) management

### **DevOps Skills:**

- Docker containerization
- Multi-stage Docker builds
- Docker Compose orchestration
- Kubernetes fundamentals (Pods, Deployments, Services)
- Kubernetes configuration (ConfigMaps, Secrets)
- Kubernetes networking (Ingress, LoadBalancer)
- Horizontal Pod Autoscaling
- Rolling updates and rollbacks
- Health checks (liveness/readiness probes)
- Resource management (requests/limits)

### **Infrastructure as Code (Terraform):**

- Terraform syntax and structure
- Resource provisioning (AWS EKS, RDS, ElastiCache)
- State management (remote state in S3)
- Variables and outputs
- Modules for reusability
- Workspaces (dev/staging/prod environments)
- Terraform plan/apply/destroy workflow
- Infrastructure versioning

### **Cloud (AWS) Skills:**

- AWS service selection and architecture
- VPC design (subnets, route tables, security groups)
- IAM policies and roles
- EKS cluster management
- RDS database configuration (backups, encryption)
- ElastiCache Redis configuration
- S3 bucket policies and lifecycle rules
- CloudWatch logs and metrics
- ALB configuration (SSL termination, health checks)
- Cost optimization strategies

### **CI/CD Skills:**

- GitHub Actions workflow syntax (YAML)
- Pipeline stages (build, test, security scan, deploy)
- Environment variable management
- GitHub Secrets for sensitive data
- Automated testing in CI
- Docker image building in pipeline
- Kubernetes deployment automation
- Blue-green deployment concepts
- Rollback strategies

### **Testing Skills:**

- Unit testing best practices (AAA pattern)
- Integration testing with real database
- Mocking external dependencies
- Test-driven development (TDD) basics
- Code coverage analysis
- Testing concurrent scenarios

### **Software Engineering Best Practices:**

- SOLID principles
- DRY (Don't Repeat Yourself)
- KISS (Keep It Simple, Stupid)
- Clean code principles
- Code review practices
- Git workflow (feature branches, pull requests)
- Semantic versioning
- Technical documentation writing
- API design principles (RESTful conventions)

### **(Future Learning) Message Queue Skills:**

- Kafka fundamentals (topics, partitions, consumers)
- Event-driven architecture
- Producer/consumer patterns
- Message serialization (JSON, Avro)
- Dead letter queues
- Message ordering and exactly-once semantics
- **Note:** Will be integrated post-MVP for email notifications and event processing

---

## 📋 PROJECT PHASES (6-WEEK TIMELINE)

### **PHASE 1: FOUNDATIONS (Week 1)**

**Focus:** Spring Boot basics, REST API fundamentals

**Deliverables:**

- Project setup with Spring Initializr
- PostgreSQL connection configured
- User entity and repository
- User registration endpoint (POST /api/auth/register)
- User login endpoint (POST /api/auth/login) - no JWT yet
- Password hashing with BCrypt
- Basic error handling

**Learning Goals:**

- Spring Boot project structure
- Maven dependencies
- Application properties configuration
- JPA entities (@Entity, @Id, @GeneratedValue)
- Spring Data JPA repositories
- Service layer pattern
- Controller layer (@RestController)
- DTO pattern
- Testing with Postman

**Tickets:**

1. Project setup and "Hello World" API
2. User registration (without JWT)
3. User login (password validation only)
4. View user profile (hardcoded user ID)

---

### **PHASE 2: EVENTS & BUSINESS LOGIC (Week 2)**

**Focus:** Complex entities, relationships, queries

**Deliverables:**

- Venue entity and CRUD operations
- Event entity with relationship to Venue
- Event CRUD endpoints (admin operations)
- Event listing with pagination
- Search functionality (by name)
- Filter by category and date
- Event status management (DRAFT, PUBLISHED, CANCELLED)

**Learning Goals:**

- One-to-many relationships (@ManyToOne, @OneToMany)
- JOIN queries
- Custom repository methods (@Query)
- Pagination (Pageable)
- Query parameters (@RequestParam)
- Business validation rules
- Soft delete pattern

**Tickets:**

1. Venue entity and CRUD
2. Event entity with venue relationship
3. Event CRUD endpoints
4. List events with pagination
5. Search events by name
6. Filter events (category, date, city)

---

### **PHASE 3: AUTHENTICATION & BOOKING (Week 3)**

**Focus:** Security, transactions, concurrency control

**Deliverables:**

- JWT authentication implementation
- Spring Security configuration
- JWT filter for token validation
- Protected endpoints (role-based)
- Booking entity and creation
- Transaction management
- Database pessimistic locking
- View user's bookings

**Learning Goals:**

- Spring Security fundamentals
- JWT structure and claims
- Token generation and validation
- @PreAuthorize annotation
- SecurityContext usage
- @Transactional annotation
- Transaction boundaries
- Pessimistic locking (@Lock)
- Race condition concepts
- Concurrent testing

**Tickets:**

1. Add Spring Security dependencies
2. Implement JWT utility class
3. Create JWT authentication filter
4. Update login to return JWT token
5. Protect endpoints with @PreAuthorize
6. Create booking entity
7. Implement booking creation (with locking)
8. View my bookings endpoint
9. Test concurrent booking scenarios

---

### **PHASE 4: DOCKER, REDIS & PAYMENTS (Week 4)**

**Focus:** Containerization, distributed systems, integrations

**Deliverables:**

- Dockerfile for application
- Docker Compose with app + PostgreSQL + Redis
- Redis integration (Redisson library)
- Distributed locking implementation
- Stripe payment integration
- Payment webhook handling
- Booking confirmation after payment
- Basic email notifications (@Async)

**Learning Goals:**

- Docker fundamentals
- Dockerfile commands
- Multi-stage builds
- Docker Compose services
- Container networking
- Redis basics (key-value store)
- Distributed locking concept
- try-lock pattern
- Stripe API integration
- Webhook signature verification
- Idempotency handling
- Asynchronous processing

**Tickets:**

1. Create Dockerfile
2. Create Docker Compose file
3. Add Redis dependency (Redisson)
4. Implement distributed lock service
5. Update booking flow with Redis lock
6. Add Stripe dependency
7. Create payment endpoint
8. Implement Stripe webhook
9. Send confirmation email (@Async)
10. Test with multiple container instances

---

### **PHASE 5: KUBERNETES & AWS DEPLOYMENT (Week 5)**

**Focus:** Cloud deployment, Kubernetes, infrastructure

**Deliverables:**

- Kubernetes manifests (Deployment, Service, ConfigMap, Secrets)
- Local Kubernetes deployment (minikube)
- AWS account setup
- Terraform configuration for AWS infrastructure
- AWS RDS PostgreSQL instance
- AWS ElastiCache Redis cluster
- AWS ECR repository
- EKS cluster (provisioned with Terraform)
- Application deployed to EKS
- Public access via Application Load Balancer

**Learning Goals:**

- Kubernetes core concepts
- kubectl commands
- Pod, Deployment, Service resources
- ConfigMap and Secrets management
- Liveness and readiness probes
- Resource requests and limits
- AWS account setup
- IAM users and permissions
- Terraform basics (providers, resources, state)
- Terraform workflow (init, plan, apply)
- VPC and networking concepts
- Security groups
- RDS configuration
- ElastiCache setup
- ECR authentication
- EKS cluster architecture
- LoadBalancer service type
- DNS and SSL/TLS

**Tickets:**

1. Install kubectl and minikube
2. Create Kubernetes Deployment manifest
3. Create Kubernetes Service manifest
4. Create ConfigMap and Secrets
5. Deploy to minikube and test
6. Create AWS account and IAM user
7. Install Terraform and AWS CLI
8. Write Terraform configuration (VPC, subnets, security groups)
9. Provision RDS with Terraform
10. Provision ElastiCache with Terraform
11. Create ECR repository
12. Build and push Docker image to ECR
13. Provision EKS cluster with Terraform
14. Deploy application to EKS
15. Configure ALB and test public access

---

### **PHASE 6: CI/CD, TESTING & DOCUMENTATION (Week 6)**

**Focus:** Automation, quality assurance, presentation

**Deliverables:**

- GitHub Actions workflow
- Automated build and test
- Security scanning (OWASP)
- Automated deployment to staging and production
- Unit tests (70%+ coverage)
- Integration tests
- JaCoCo coverage report
- Comprehensive README.md
- Architecture diagrams
- API documentation (Swagger)
- Demo video (5-10 minutes)
- Updated resume and LinkedIn

**Learning Goals:**

- CI/CD concepts
- GitHub Actions syntax
- YAML workflow configuration
- Automated testing in pipeline
- Docker image building in CI
- Kubernetes deployment automation
- Multi-environment deployment
- Manual approval gates
- JUnit test structure
- Mockito mocking
- Testcontainers for integration tests
- Technical writing
- Documentation best practices
- Demo presentation skills

**Tickets:**

1. Create GitHub Actions workflow file
2. Configure build and test stage
3. Add OWASP dependency check
4. Configure Docker build and push
5. Configure deployment to staging
6. Add manual approval for production
7. Write unit tests for services
8. Write integration tests for booking flow
9. Generate JaCoCo coverage report
10. Write comprehensive README
11. Create architecture diagrams
12. Configure Swagger/OpenAPI
13. Record demo video
14. Update resume with project
15. Update LinkedIn profile
16. Write blog post (optional)

---

## 🎯 CORE FEATURES (PRIORITIZED)

### **MVP Features (Must Have):**

1. **User Management**

   - Registration (email + password)
   - Login (JWT token generation)
   - View profile
   - Update profile
   - Role-based access (USER, ADMIN)

2. **Event Management**

   - Create event (admin only)
   - Update event (admin only)
   - Delete/cancel event (admin only)
   - List all events (public, paginated)
   - View single event details (public)
   - Search events by name
   - Filter events (category, date range, city, price range)
   - Event categories (Music, Sports, Theater, Comedy, Festival)
   - Event status (Draft, Published, Cancelled)

3. **Venue Management**

   - Create venue (admin only)
   - List venues (public)
   - View venue details (public)

4. **Booking System** (MOST CRITICAL)

   - Reserve tickets (temporary hold, 10-minute expiry)
   - Check availability (prevent overselling)
   - Distributed locking (Redis + PostgreSQL)
   - Race condition prevention
   - View my bookings (authenticated user)
   - View single booking details
   - Cancel booking (user-initiated, refund)
   - Auto-cancel expired reservations (background job)

5. **Payment Processing**

   - Stripe integration (test mode)
   - Create payment intent
   - Confirm payment
   - Webhook handling
   - Refund processing
   - Payment status tracking

6. **Email Notifications**

   - Welcome email (on registration)
   - Booking confirmation (on payment success)
   - Event reminder (1 day before event)
   - Cancellation confirmation
   - Event cancellation notification (admin cancelled)
   - Asynchronous sending (@Async)

7. **Search & Filtering**
   - Search by name (partial match, case-insensitive)
   - Filter by category
   - Filter by date range
   - Filter by city/location
   - Filter by price range
   - Sort by date, price, popularity
   - Pagination (20 items per page)

---

### **Post-MVP Features (Future Enhancements):**

8. **QR Code Generation**

   - Unique QR code per ticket
   - Scannable at venue entry
   - Stored in S3
   - Included in confirmation email

9. **Admin Dashboard & Analytics**

   - Sales overview (revenue, bookings, tickets sold)
   - Top performing events
   - Sales trend graphs
   - Event-specific analytics
   - User management (view, block, reset password)
   - Export data to CSV

10. **Waitlist System**

    - Join waitlist for sold-out events
    - FIFO notification when tickets available
    - Time-limited offer (1 hour to book)

11. **Discount Codes / Promo Codes**

    - Create promo codes (admin)
    - Apply discount at checkout
    - Fixed amount or percentage discount
    - Usage limits and expiry
    - Track redemptions

12. **Reviews & Ratings**

    - Rate events (1-5 stars)
    - Write reviews (post-event only)
    - Display average rating
    - Flag inappropriate reviews (moderation)

13. **Message Queue Integration (Kafka/SQS)**

    - Event-driven architecture
    - Decouple email sending
    - Booking event streaming
    - Analytics event processing
    - Dead letter queue for failed messages

14. **Advanced Caching**

    - Cache warming on deployment
    - Cache stampede prevention
    - Write-through caching
    - Cache hit rate monitoring

15. **Rate Limiting**

    - Per-user rate limits
    - Per-IP rate limits
    - Prevent bot attacks
    - Sliding window algorithm

16. **Multi-Currency Support**

    - Display prices in multiple currencies
    - Real-time exchange rates
    - Currency conversion at checkout

17. **Seat Selection**

    - Interactive seat map
    - Lock specific seats (not just quantity)
    - Section-based pricing
    - Seat number assignment

18. **Advanced Monitoring**
    - Prometheus metrics collection
    - Grafana dashboards
    - Custom business metrics
    - Application Performance Monitoring (APM)
    - Distributed tracing (Jaeger/Zipkin)

---

## 🏛️ ARCHITECTURAL DECISIONS & PATTERNS

### **Architecture Style:**

- **Monolithic** (not microservices)
  - Simpler for single developer
  - Easier to debug and deploy
  - Lower latency (no network calls between services)
  - Can refactor to microservices later if needed

### **Design Patterns Used:**

- **Layered Architecture** (Controller → Service → Repository)
- **DTO Pattern** (separate API models from entities)
- **Repository Pattern** (data access abstraction)
- **Dependency Injection** (Spring's IoC container)
- **Strategy Pattern** (payment processing)
- **Observer Pattern** (event listeners for notifications)
- **Builder Pattern** (entity construction)

### **Key Architectural Principles:**

- **Stateless Application** (no in-memory sessions, enables horizontal scaling)
- **Idempotency** (safe to retry operations)
- **Fail-Fast** (validate early, fail quickly)
- **Graceful Degradation** (system works with reduced functionality if Redis fails)
- **Defense in Depth** (multiple layers of security)
- **Separation of Concerns** (each layer has single responsibility)

### **Database Design:**

- **Normalized** (3rd Normal Form for data integrity)
- **Strategic Denormalization** (cache available_tickets for performance)
- **Soft Deletes** (never hard delete, use deleted_at timestamp)
- **Audit Columns** (created_at, updated_at on all tables)
- **Optimistic Locking** (version field) + **Pessimistic Locking** (SELECT FOR UPDATE)

### **API Design:**

- **RESTful conventions** (resource-based URLs, HTTP verbs)
- **Consistent response format** (success, error, pagination)
- **Versioning ready** (/api/v1/...)
- **HATEOAS principles** (hypermedia links in responses - optional)

### **Concurrency Control Strategy:**

- **Double Locking**: Redis (distributed) + PostgreSQL (row-level)
  - Redis lock coordinates across multiple app servers
  - Database lock ensures consistency even if Redis fails
  - All-or-nothing transactions (@Transactional)
  - TTL-based lock expiration (prevents deadlocks)

### **Caching Strategy:**

- **Cache-Aside Pattern** (lazy loading)
- **TTL-Based Expiration** (5-10 minutes for event data)
- **Event-Based Invalidation** (clear cache on updates)
- **Selective Caching** (frequently read, infrequently updated data)

### **Error Handling:**

- **Global Exception Handler** (@ControllerAdvice)
- **Custom Exceptions** (ResourceNotFoundException, InsufficientTicketsException)
- **Consistent Error Response** (status code, message, timestamp, requestId)
- **Meaningful Error Messages** (client can understand and act on)

### **Security Considerations:**

- **Principle of Least Privilege** (minimal permissions)
- **Defense in Depth** (multiple security layers)
- **Never Trust User Input** (always validate)
- **Secure by Default** (HTTPS, encrypted credentials)
- **Audit Logging** (track sensitive operations)

---

## 🎓 TEACHING METHODOLOGY

### **Learning Approach:**

This project follows a **learn-by-doing** methodology where concepts are taught incrementally as they become relevant to the current feature being built.

### **Ticket-Based Learning:**

Each feature is broken into small tickets (2-4 hours each) with:

- Clear acceptance criteria
- Starter code/templates
- Step-by-step instructions
- Testing guidelines
- Resources for learning

### **Pair Programming Style:**

1. **I Explain** (15 min) - Concept overview with diagrams
2. **I Show** (30 min) - Live coding demonstration
3. **You Code** (2 hours) - Independent implementation
4. **We Review** (30 min) - Code review and refactoring
5. **You Teach** (15 min) - Explain back to solidify understanding

### **Progress Tracking:**

- Daily standups (async: what I did, what I'm doing, blockers)
- Weekly reviews (demo completed features, Q&A)
- Kanban board (Backlog → To Do → In Progress → Done)

### **Support Model:**

- On-demand help when stuck (share error, get debugging help)
- Weekly live sessions for complex topics
- Resource library (videos, articles, cheat sheets)
- Example code repository for reference

---

## 🎤 INTERVIEW PREPARATION

### **Technical Story (The Hook):**

> "I built a cloud-native event ticketing platform that handles concurrent bookings at scale. The most interesting challenge was preventing race conditions when thousands of users try to book the last ticket simultaneously. I solved this using Redis distributed locks combined with PostgreSQL pessimistic locking, ensuring exactly-once booking semantics even across multiple application instances.
>
> I containerized the application with Docker and deployed it on AWS EKS with Kubernetes orchestration. I implemented a CI/CD pipeline with GitHub Actions that automatically runs tests, builds Docker images, and deploys to production with zero downtime using rolling updates.
>
> The infrastructure is provisioned entirely with Terraform, making it reproducible and version-controlled. The system handles payment processing via Stripe, sends asynchronous email notifications, and includes comprehensive monitoring with CloudWatch."

### **Key Talking Points:**

1. **Concurrency Control** - Distributed locking, race conditions, transaction isolation
2. **Scalability** - Horizontal scaling, stateless design, load balancing
3. **Cloud Architecture** - AWS services, Kubernetes orchestration, infrastructure as code
4. **DevOps** - CI/CD pipeline, automated testing, zero-downtime deployments
5. **Security** - JWT authentication, password hashing, PCI compliance considerations
6. **System Design** - Architecture decisions, trade-offs, why not microservices

### **Common Follow-Up Questions & Answers:**

**Q: How do you prevent double booking?**
A: "I use a two-layer locking strategy. First, a distributed Redis lock coordinates across multiple application servers. Then, a PostgreSQL pessimistic lock (SELECT FOR UPDATE) ensures database-level consistency. The entire booking flow runs in a transaction, so either all operations succeed or all rollback."

**Q: What happens if Redis fails?**
A: "I designed the system to fail safely. If Redis is unavailable, the application returns a 503 Service Unavailable rather than risking data inconsistency. For future enhancement, I could implement a fallback to database-only locking, accepting lower throughput but maintaining correctness."

**Q: How do you scale this system?**
A: "The application is stateless—no in-memory sessions. Kubernetes handles horizontal scaling by adding more pods based on CPU/memory utilization. The database uses connection pooling to handle multiple app instances efficiently. Redis is shared across all instances for distributed coordination."

**Q: Why Kubernetes instead of simpler alternatives like ECS?**
A: "Kubernetes provides better learning value and career prospects. It's the industry standard, cloud-agnostic, and offers rich ecosystem tools. While ECS is simpler, K8s demonstrates deeper understanding of container orchestration concepts."

**Q: How do you handle payment failures?**
A: "Stripe webhooks provide async payment confirmation. If a payment fails, the booking remains in PENDING status, allowing the user to retry. After three failed attempts or 10 minutes expiration, a background job cancels the booking and releases the tickets. All payment operations are idempotent using Stripe's payment intent IDs."

**Q: What would you do differently with more time?**
A: "I'd implement a message queue (Kafka or SQS) for email notifications to decouple that processing. I'd add Prometheus and Grafana for richer monitoring. I'd implement circuit breakers for external service calls. I'd also add more comprehensive end-to-end tests and load testing with realistic traffic patterns."

---

## 📊 SUCCESS METRICS

### **Technical Metrics:**

- **Code Coverage:** >70% (JaCoCo report)
- **API Response Time:** <200ms average, <500ms P99
- **Deployment Success Rate:** >95%
- **Zero Downtime Deployments:** Achieved via rolling updates
- **Concurrent Users Supported:** 1,000+ (load test verified)

### **Project Completeness:**

- ✅ All MVP features implemented and tested
- ✅ Deployed to AWS and publicly accessible
- ✅ CI/CD pipeline functional
- ✅ Comprehensive documentation (README, API docs, architecture)
- ✅ Demo video prepared
- ✅ Resume and LinkedIn updated

### **Learning Outcomes:**

- ✅ Can explain entire architecture confidently
- ✅ Can discuss concurrency solutions in depth
- ✅ Can demonstrate Terraform and K8s knowledge
- ✅ Can handle technical interview questions about the project
- ✅ Understands trade-offs and design decisions

---

## 🚀 GETTING STARTED CHECKLIST

### **Prerequisites:**

- [ ] Java 17 JDK installed
- [ ] Maven installed
- [ ] PostgreSQL 15 installed (or Docker)
- [ ] Docker Desktop installed
- [ ] Git installed
- [ ] IntelliJ IDEA or VS Code installed
- [ ] Postman or similar API client installed
- [ ] GitHub account created
- [ ] AWS account created (free tier)
- [ ] Stripe account created (test mode)

### **First Steps:**

1. Clone starter repository (will be provided)
2. Review project structure
3. Set up local development environment
4. Run "Hello World" endpoint
5. Connect to local PostgreSQL
6. Complete Week 1, Ticket 1 (User Registration)

---

## 📞 COMMUNICATION PROTOCOL

### **When to Ask for Help:**

- Stuck for more than 30 minutes on same issue
- Unclear about ticket requirements
- Need clarification on concepts
- Error messages you don't understand

### **How to Ask for Help:**

1. Describe what you're trying to do
2. Share the error message (full stack trace)
3. Share relevant code snippet
4. Explain what you've already tried

### **Expected Response Time:**

- Simple questions: Within 2 hours
- Complex debugging: Within 24 hours
- Weekly review: Scheduled time

---

## 🎯 PROJECT CONTEXT FOR CLAUDE

**When assisting with this project, remember:**

1. **The developer is a beginner** learning Java/Spring Boot while building
2. **Explain concepts before providing code** - teach, don't just solve
3. **Break complex topics into digestible chunks**
4. **Provide context for architectural decisions** - explain the "why"
5. **Encourage best practices** but balance with learning curve
6. **This is a resume project** - quality and demonstrable skills matter
7. **Timeline is 6 weeks** - help prioritize and scope appropriately
8. **Use ticket-based approach** - reference specific tickets when helping
9. **Terraform will be used** for all AWS infrastructure provisioning
10. **Kafka/message queue is future enhancement** - don't add yet, but design for it

### **Code Review Focus Areas:**

- Is the code following Spring Boot conventions?
- Are there security vulnerabilities?
- Is error handling comprehensive?
- Are transactions used correctly?
- Is the code testable?
- Are there performance issues?
- Is the code readable and maintainable?

### **Teaching Priorities:**

1. Concurrency control (the "wow" factor)
2. Spring Boot fundamentals (foundation for career)
3. Kubernetes and cloud deployment (differentiator)
4. Testing and CI/CD (professional quality)
5. System design thinking (interview preparation)

---

## 📚 RESOURCE LIBRARY

### **Essential Documentation:**

- Spring Boot Reference: https://docs.spring.io/spring-boot/docs/current/reference/html/
- Spring Data JPA: https://docs.spring.io/spring-data/jpa/docs/current/reference/html/
- Terraform AWS Provider: https://registry.terraform.io/providers/hashicorp/aws/latest/docs
- Kubernetes Concepts: https://kubernetes.io/docs/concepts/
- AWS EKS User Guide: https://docs.aws.amazon.com/eks/latest/userguide/

### **Recommended Video Courses:**

- Spring Boot Tutorial for Beginners (Amigoscode)
- Docker Tutorial for Beginners (TechWorld with Nana)
- Kubernetes Tutorial for Beginners (TechWorld with Nana)
- Terraform Tutorial for Beginners (freeCodeCamp)

### **Cheat Sheets:**

- Spring Boot Annotations
- JPA/Hibernate Annotations
- Docker Commands
- Kubectl Commands
- Terraform Commands
- PostgreSQL SQL Reference

---

## 🎉 PROJECT COMPLETION CRITERIA

**The project is considered complete when:**

1. ✅ All MVP features are implemented and working
2. ✅ Application is deployed on AWS EKS and publicly accessible
3. ✅ CI/CD pipeline is functional (GitHub Actions)
4. ✅ Infrastructure is provisioned with Terraform
5. ✅ Code coverage is >70%
6. ✅ README.md is comprehensive with architecture diagrams
7. ✅ API documentation is generated (Swagger)
8. ✅ Demo video is recorded and uploaded
9. ✅ Resume is updated with quantifiable achievements
10. ✅ Developer can confidently explain all architectural decisions

**At that point:**

- You can start applying for jobs with confidence
- You have a strong portfolio piece
- You have clear technical stories for interviews
- You understand distributed systems fundamentals
- You have hands-on experience with modern tech stack

---

## 🔄 POST-PROJECT ENHANCEMENTS (Optional)

After securing a job or if time permits before job search:

1. **Add Kafka/SQS Message Queue**

   - Event-driven architecture
   - Decouple email notifications
   - Stream booking events

2. **Implement Advanced Monitoring**

   - Prometheus + Grafana
   - Custom dashboards
   - Business metrics visualization

3. **Add GraphQL API**

   - Alternative to REST
   - Client-driven queries
   - Reduced over-fetching

4. **Build Admin Frontend**

   - React or Angular
   - Dashboard for analytics
   - Event management UI

5. **Implement A/B Testing Framework**

   - Feature flags
   - Experimentation platform
   - Analytics integration

6. **Add Machine Learning**
   - Event recommendations
   - Dynamic pricing
   - Fraud detection

---

**END OF PROJECT DESCRIPTION**

---

**This document should be added to your Claude Project Knowledge so that in every conversation, Claude has full context of what we're building, why, and how we're approaching it. This ensures consistency and alignment throughout the 6-week journey.**


​​EPIC: Venue Management
TICKET TH-201: Create Venue Entity & Repository
Type: Feature | Priority: High | Estimate: 3 hours
Description: Create the Venue entity that represents physical locations where events take place. This is the foundation for event management, as every event requires a venue.
Acceptance Criteria:
Venue entity created with fields: id, name, address, city, state, zipCode, capacity, description, createdAt, updatedAt
VenueRepository extends JpaRepository
Entity uses proper JPA annotations (@Entity, @Id, @GeneratedValue, @Column)
Audit fields (createdAt, updatedAt) auto-populate using @CreationTimestamp and @UpdateTimestamp
Unit test verifies entity can be saved and retrieved
Technical Notes:
Use UUID or Long for ID (recommend Long for simplicity)
capacity field will be used later to validate ticket availability
Consider adding @Column(nullable = false) for required fields

TICKET TH-202: Venue DTO & Mapper
Type: Feature | Priority: High | Estimate: 2 hours
Description: Create DTOs for Venue to separate API contract from database entity. This prevents exposing internal entity structure and allows API versioning.
Acceptance Criteria:
CreateVenueRequest DTO with validation annotations (@NotBlank, @Min, etc.)
VenueResponse DTO for API responses
VenueMapper class to convert between Entity and DTOs
Validation messages are user-friendly
Technical Notes:
Use Jakarta validation annotations (not javax)
Consider using MapStruct or manual mapping (manual recommended for learning)

TICKET TH-203: Venue Service Layer
Type: Feature | Priority: High | Estimate: 2 hours
Description: Implement business logic layer for venue operations.
Acceptance Criteria:
VenueService interface defined
VenueServiceImpl with @Service annotation
Methods: createVenue(), getAllVenues(), getVenueById(), updateVenue(), deleteVenue()
Throws ResourceNotFoundException when venue not found
Service is unit tested with Mockito
Technical Notes:
Inject VenueRepository via constructor injection
Use Optional handling properly (orElseThrow)

TICKET TH-204: Venue Controller & Endpoints
Type: Feature | Priority: High | Estimate: 3 hours
Description: Create REST endpoints for venue management with proper authorization.
Acceptance Criteria:
POST /api/admin/venues - Create venue (ADMIN only)
GET /api/venues - List all venues (Public)
GET /api/venues/{id} - Get venue by ID (Public)
PUT /api/admin/venues/{id} - Update venue (ADMIN only)
DELETE /api/admin/venues/{id} - Delete venue (ADMIN only)
All endpoints return proper HTTP status codes
Validation errors return 400 with details
Tested with Postman
Technical Notes:
Use @PreAuthorize("hasRole('ADMIN')") for admin endpoints
Return ResponseEntity with appropriate status codes
Use @Valid for request body validation

EPIC: Event Management
TICKET TH-205: Create Event Entity with Relationships
Type: Feature | Priority: High | Estimate: 4 hours
Description: Create the Event entity with relationships to both Venue (where it happens) and User (who created it).
Acceptance Criteria:
Event entity with fields: id, name, description, artistName, eventDateTime, price, totalTickets, availableTickets, imageUrl, createdAt, updatedAt
@ManyToOne relationship to Venue (many events at one venue)
@ManyToOne relationship to User (many events created by one admin)
EventStatus enum: DRAFT, PUBLISHED, CANCELLED
EventCategory enum: MUSIC, SPORTS, THEATER, COMEDY, FESTIVAL, CONFERENCE, OTHER
Foreign key constraints properly defined
Entity can be saved with associated Venue and User
Technical Notes:
Use @JoinColumn(name = "venue_id") for foreign key
Use @Enumerated(EnumType.STRING) for enums
availableTickets starts equal to totalTickets
Consider lazy vs eager loading (use LAZY, fetch when needed)

TICKET TH-206: Event DTOs & Mapper
Type: Feature | Priority: High | Estimate: 2 hours
Description: Create DTOs for Event API operations.
Acceptance Criteria:
CreateEventRequest DTO with venueId field (not full venue object)
UpdateEventRequest DTO
EventResponse DTO (includes nested VenueSummary, not full venue)
EventSummaryResponse for list views (lighter payload)
Proper validation on all request DTOs
EventMapper handles all conversions
Technical Notes:
Don't expose User details in response (just createdBy name if needed)
Use @Future for eventDateTime validation
Price should be BigDecimal, not double

TICKET TH-207: Event Service Layer
Type: Feature | Priority: High | Estimate: 3 hours
Description: Implement business logic for event management.
Acceptance Criteria:
EventService interface and EventServiceImpl
createEvent() - validates venue exists, sets creator from SecurityContext
updateEvent() - only allows updates to DRAFT events (or ADMIN override)
publishEvent() - changes status from DRAFT to PUBLISHED
cancelEvent() - changes status to CANCELLED
getEventById(), getAllPublishedEvents()
Business rule: Cannot delete published events with bookings (soft delete)
Unit tests for all methods
Technical Notes:
Get current user from SecurityContextHolder
Validate venue capacity >= totalTickets
Consider what happens to availableTickets if totalTickets is updated

TICKET TH-208: Event CRUD Endpoints
Type: Feature | Priority: High | Estimate: 3 hours
Description: Create REST endpoints for event management.
Acceptance Criteria:
POST /api/admin/events - Create event (ADMIN only)
GET /api/events - List published events (Public)
GET /api/events/{id} - Get event details (Public, only if PUBLISHED)
PUT /api/admin/events/{id} - Update event (ADMIN only)
PATCH /api/admin/events/{id}/publish - Publish event (ADMIN only)
PATCH /api/admin/events/{id}/cancel - Cancel event (ADMIN only)
DELETE /api/admin/events/{id} - Soft delete (ADMIN only)
All endpoints tested with Postman
Technical Notes:
Use @PatchMapping for status changes
Return 404 for non-existent or non-published events on public endpoints

TICKET TH-209: Event Pagination
Type: Feature | Priority: Medium | Estimate: 2 hours
Description: Add pagination to event listing to handle large datasets efficiently.
Acceptance Criteria:
GET /api/events accepts page, size, sort parameters
Default page size is 20, max is 100
Response includes: content, totalElements, totalPages, currentPage, hasNext, hasPrevious
Can sort by eventDateTime, price, name
PagedResponse wrapper DTO created
Technical Notes:
Use Pageable parameter in controller
Use Page<Event> from repository
Create custom PagedResponse<T> for consistent pagination response

TICKET TH-210: Event Search & Filtering
Type: Feature | Priority: Medium | Estimate: 4 hours
Description: Implement search and filtering capabilities for events.
Acceptance Criteria:
Search by name (partial match, case-insensitive)
Filter by category
Filter by city (from venue)
Filter by date range (startDate, endDate)
Filter by price range (minPrice, maxPrice)
Filters can be combined
All filters work with pagination
Technical Notes:
Use Spring Data JPA Specifications or @Query with JPQL
Consider using Criteria API for dynamic queries
Index frequently filtered columns (category, eventDateTime, venue.city)

PHASE 3: BOOKING SYSTEM (Week 3)

EPIC: Booking Management
TICKET TH-301: Create Booking Entity
Type: Feature | Priority: Critical | Estimate: 3 hours
Description: Create the Booking entity that represents a user's ticket purchase.
Acceptance Criteria:
Booking entity with fields: id, quantity, totalPrice, bookingReference (unique), createdAt, updatedAt
@ManyToOne relationship to User (who made the booking)
@ManyToOne relationship to Event (which event)
BookingStatus enum: PENDING, CONFIRMED, CANCELLED, EXPIRED
bookingReference is auto-generated unique string (e.g., "TH-ABC123XYZ")
Entity properly mapped with JPA
Technical Notes:
Generate bookingReference using UUID or custom algorithm
totalPrice = event.price * quantity
Consider adding expiresAt field for pending bookings

TICKET TH-302: Booking DTOs & Mapper
Type: Feature | Priority: High | Estimate: 2 hours
Description: Create DTOs for booking operations.
Acceptance Criteria:
CreateBookingRequest DTO with eventId and quantity
BookingResponse DTO with event summary, user info, status
BookingMapper for conversions
Validation: quantity must be >= 1
Technical Notes:
Don't expose full user details in response
Include event name, date, venue name in response for convenience

TICKET TH-303: Booking Service with Database Locking
Type: Feature | Priority: Critical | Estimate: 6 hours
Description: Implement booking creation with pessimistic locking to prevent race conditions. This is the core of the project's concurrency control.
Acceptance Criteria:
createBooking() method with @Transactional
Before booking: check availableTickets >= requested quantity
Use pessimistic locking on Event row (SELECT FOR UPDATE)
Decrement availableTickets atomically
Create Booking with PENDING status
Return error if insufficient tickets
Concurrent booking test proves no overselling
Technical Notes:
Use @Lock(LockModeType.PESSIMISTIC_WRITE) on repository method
Transaction isolation level matters
Write integration test with multiple threads
This is DATABASE-level locking (Redis comes in Phase 4)

TICKET TH-304: Booking Controller
Type: Feature | Priority: High | Estimate: 3 hours
Description: Create REST endpoints for booking operations.
Acceptance Criteria:
POST /api/bookings - Create booking (Authenticated users)
GET /api/bookings - List my bookings (Authenticated, own bookings only)
GET /api/bookings/{id} - Get booking details (Owner or ADMIN only)
PATCH /api/bookings/{id}/cancel - Cancel booking (Owner or ADMIN)
GET /api/admin/bookings - List all bookings (ADMIN only)
Proper authorization checks
Technical Notes:
Extract userId from SecurityContext
Verify booking belongs to user before returning
Cancellation should restore availableTickets

TICKET TH-305: Booking Cancellation & Refund Logic
Type: Feature | Priority: High | Estimate: 3 hours
Description: Implement booking cancellation with ticket restoration.
Acceptance Criteria:
User can cancel PENDING or CONFIRMED bookings
Cancelled bookings restore availableTickets to event
Cannot cancel if event already happened
Cannot cancel CANCELLED or EXPIRED bookings
Cancellation uses same locking strategy as creation
Business rule: Can only cancel up to 24 hours before event
Technical Notes:
Refund logic will be added in Payment phase
For now, just change status and restore tickets
Wrap in @Transactional

TICKET TH-306: Booking Expiration Job
Type: Feature | Priority: Medium | Estimate: 3 hours
Description: Create scheduled job to expire old PENDING bookings and restore tickets.
Acceptance Criteria:
Scheduled job runs every 5 minutes
Finds PENDING bookings older than 10 minutes
Changes status to EXPIRED
Restores availableTickets to event
Logs number of expired bookings
Job is enabled/disabled via configuration
Technical Notes:
Use @Scheduled annotation
Enable scheduling with @EnableScheduling
Consider batch processing for efficiency
Make timeout configurable via application.properties

PHASE 4: DOCKER, REDIS & PAYMENTS (Week 4)

EPIC: Containerization
TICKET TH-401: Create Dockerfile
Type: DevOps | Priority: High | Estimate: 2 hours
Description: Create optimized multi-stage Dockerfile for the application.
Acceptance Criteria:
Multi-stage build (build stage + runtime stage)
Uses Eclipse Temurin JDK 17 base image
Final image size < 300MB
Application runs as non-root user
Health check configured
.dockerignore file created
Can build and run locally
Technical Notes:
Stage 1: Maven build with dependency caching
Stage 2: JRE-only runtime
Expose port 8080
Use ENTRYPOINT for Java app

TICKET TH-402: Docker Compose Setup
Type: DevOps | Priority: High | Estimate: 3 hours
Description: Create Docker Compose configuration for local development.
Acceptance Criteria:
docker-compose.yml with services: app, postgres, redis
PostgreSQL 15 with persistent volume
Redis 7 with persistent volume
App connects to containerized databases
Environment variables for configuration
Health checks for all services
Single command startup: docker-compose up
Technical Notes:
Use Docker networks for service communication
Externalize database credentials
Add pgAdmin service (optional, for debugging)

EPIC: Redis Integration
TICKET TH-403: Add Redis Dependencies & Configuration
Type: Feature | Priority: High | Estimate: 2 hours
Description: Configure Redis connection using Redisson library.
Acceptance Criteria:
Add Redisson dependency to pom.xml
Create RedisConfig class with @Configuration
RedissonClient bean configured
Connection works in Docker Compose environment
Health check endpoint includes Redis status
Technical Notes:
Redisson is preferred over Jedis for distributed locking
Configure via application.properties
Consider connection pooling settings

TICKET TH-404: Implement Distributed Lock Service
Type: Feature | Priority: Critical | Estimate: 4 hours
Description: Create a service for distributed locking using Redis.
Acceptance Criteria:
DistributedLockService interface with tryLock(), unlock() methods
RedisDistributedLockService implementation using Redisson RLock
Lock has configurable TTL (default 30 seconds)
Lock has configurable wait time (default 10 seconds)
Graceful handling if Redis is unavailable
Unit tests with embedded Redis or mocks
Technical Notes:
Use RLock from Redisson
Key pattern: "lock:booking:event:{eventId}"
Always release lock in finally block
Consider using try-with-resources pattern

TICKET TH-405: Integrate Redis Lock into Booking Flow
Type: Feature | Priority: Critical | Estimate: 4 hours
Description: Update booking service to use Redis distributed lock before database lock.
Acceptance Criteria:
Booking flow: Acquire Redis lock → Check availability → DB lock → Book → Release Redis lock
If Redis lock fails, return 409 Conflict (try again)
If Redis unavailable, fall back to DB-only locking with warning
Load test with multiple app instances proves no overselling
Metrics track lock acquisition time
Technical Notes:
This creates double-locking: Redis (distributed) + PostgreSQL (row-level)
Redis prevents multiple app servers from racing
DB lock prevents race within same transaction
Test with 2+ app containers in Docker Compose

TICKET TH-406: Implement Caching for Events
Type: Feature | Priority: Medium | Estimate: 3 hours
Description: Cache frequently accessed event data in Redis.
Acceptance Criteria:
Event details cached with 5-minute TTL
Event list cached with 2-minute TTL
Cache invalidated on event update/delete
Cache-aside pattern implemented
Cache hit/miss metrics logged
Technical Notes:
Use Spring Cache abstraction (@Cacheable, @CacheEvict)
Configure RedisCacheManager
Don't cache availableTickets (changes frequently)

EPIC: Payment Integration
TICKET TH-407: Stripe Account & Configuration
Type: Setup | Priority: High | Estimate: 1 hour
Description: Set up Stripe test account and configure application.
Acceptance Criteria:
Stripe test account created
API keys stored in application.properties (dev) and secrets (prod)
Stripe Java SDK dependency added
StripeConfig class initializes API key
Test API connection works
Technical Notes:
Use test mode keys (pk_test_, sk_test_)
Never commit real keys to repository
Use environment variables for keys

TICKET TH-408: Payment Intent Service
Type: Feature | Priority: High | Estimate: 4 hours
Description: Implement Stripe Payment Intent creation for bookings.
Acceptance Criteria:
PaymentService creates PaymentIntent via Stripe API
PaymentIntent amount matches booking total (in cents)
PaymentIntent metadata includes bookingId
Returns clientSecret to frontend
Payment entity created to track payment status
Unit tests with Stripe mocks
Technical Notes:
Amount must be in cents (USD)
Store PaymentIntent ID in Payment entity
Payment statuses: PENDING, SUCCEEDED, FAILED

TICKET TH-409: Stripe Webhook Handler
Type: Feature | Priority: High | Estimate: 4 hours
Description: Handle Stripe webhooks for async payment confirmation.
Acceptance Criteria:
POST /api/webhooks/stripe endpoint
Webhook signature verification
Handle payment_intent.succeeded event
Handle payment_intent.payment_failed event
Update booking status based on payment result
Webhook handler is idempotent (safe to receive same event twice)
Technical Notes:
Use Stripe webhook signing secret
Log all webhook events
Return 200 OK quickly, process async if needed
Test with Stripe CLI: stripe listen --forward-to localhost:8080/api/webhooks/stripe

TICKET TH-410: Update Booking Flow with Payment
Type: Feature | Priority: High | Estimate: 3 hours
Description: Integrate payment into booking creation flow.
Acceptance Criteria:
createBooking() now returns PaymentIntent clientSecret
Booking stays PENDING until payment confirmed
Successful payment changes booking to CONFIRMED
Failed payment changes booking to PAYMENT_FAILED (restore tickets)
Flow tested end-to-end with Stripe test cards
Technical Notes:
Frontend will use clientSecret with Stripe.js
Consider timeout for payment completion
Test with various Stripe test card numbers

EPIC: Email Notifications
TICKET TH-411: Email Service Configuration
Type: Setup | Priority: Medium | Estimate: 2 hours
Description: Configure email sending capability using SendGrid or AWS SES.
Acceptance Criteria:
Email provider configured (SendGrid recommended for dev)
EmailService interface defined
Connection tested with test email
HTML email templates supported (Thymeleaf)
Email sending is async (@Async)
Technical Notes:
SendGrid free tier: 100 emails/day
Configure sender email address
Create templates directory

TICKET TH-412: Booking Confirmation Email
Type: Feature | Priority: Medium | Estimate: 3 hours
Description: Send confirmation email after successful booking.
Acceptance Criteria:
HTML email template with booking details
Includes: event name, date, venue, quantity, total price, booking reference
Sent asynchronously after payment success
Failure to send email doesn't fail the booking
Email logged for debugging
Technical Notes:
Use Thymeleaf for HTML templates
Include event image if available
Add unsubscribe link (for compliance)

TICKET TH-413: Event Cancellation Email
Type: Feature | Priority: Medium | Estimate: 2 hours
Description: Notify users when an event they booked is cancelled.
Acceptance Criteria:
Email sent to all users with bookings for cancelled event
Includes refund information
Sent asynchronously
Batch processing for events with many bookings
Technical Notes:
Triggered when admin cancels event
Consider rate limiting for large events
Queue emails rather than sending inline

PHASE 5: KUBERNETES & AWS (Week 5)

EPIC: Kubernetes Basics
TICKET TH-501: Install kubectl & Minikube
Type: Setup | Priority: High | Estimate: 1 hour
Description: Set up local Kubernetes development environment.
Acceptance Criteria:
kubectl installed and configured
Minikube installed and running
Can run kubectl get nodes successfully
Basic understanding of K8s concepts documented
Technical Notes:
Minikube needs 4GB+ RAM allocated
Enable ingress addon: minikube addons enable ingress

TICKET TH-502: Create Kubernetes Deployment Manifest
Type: DevOps | Priority: High | Estimate: 3 hours
Description: Create Kubernetes Deployment for the application.
Acceptance Criteria:
deployment.yaml with 2 replicas
Resource requests and limits defined
Liveness probe configured (health endpoint)
Readiness probe configured
Environment variables from ConfigMap/Secrets
Rolling update strategy configured
Technical Notes:
Start with small resource limits for dev
Use /actuator/health for probes
Consider startup probe for slow-starting apps

TICKET TH-503: Create Kubernetes Service Manifest
Type: DevOps | Priority: High | Estimate: 2 hours
Description: Create Kubernetes Service to expose the application.
Acceptance Criteria:
service.yaml with ClusterIP type (internal)
Port 80 → target port 8080
Selector matches deployment labels
Service accessible within cluster
Technical Notes:
ClusterIP for internal, LoadBalancer for external (later)
Use consistent labeling strategy

TICKET TH-504: Create ConfigMap & Secrets
Type: DevOps | Priority: High | Estimate: 2 hours
Description: Externalize configuration using Kubernetes ConfigMaps and Secrets.
Acceptance Criteria:
configmap.yaml with non-sensitive config (Spring profiles, feature flags)
secrets.yaml with sensitive data (DB credentials, API keys)
Application reads config from environment variables
Secrets are base64 encoded
Technical Notes:
Never commit real secrets to git
Use sealed-secrets or external secrets manager in prod
Document which env vars are required

TICKET TH-505: Deploy to Minikube
Type: DevOps | Priority: High | Estimate: 2 hours
Description: Deploy complete application stack to local Minikube.
Acceptance Criteria:
Application running in Minikube
Can access via minikube service command
Logs viewable via kubectl logs
Can scale replicas up/down
Health checks passing
Technical Notes:
Use minikube tunnel for LoadBalancer services
Document deployment steps in README

EPIC: AWS Infrastructure with Terraform
TICKET TH-506: AWS Account & IAM Setup
Type: Setup | Priority: High | Estimate: 2 hours
Description: Set up AWS account and create IAM user for Terraform.
Acceptance Criteria:
AWS account created (free tier)
IAM user created with programmatic access
IAM policy with required permissions attached
AWS CLI configured with credentials
MFA enabled on root account
Technical Notes:
Don't use root account for daily operations
Create dedicated IAM user for Terraform
Enable billing alerts

TICKET TH-507: Terraform Project Structure
Type: DevOps | Priority: High | Estimate: 2 hours
Description: Set up Terraform project structure.
Acceptance Criteria:
terraform/ directory with proper structure
main.tf, variables.tf, outputs.tf created
AWS provider configured
S3 backend for state (create bucket manually first)
terraform init succeeds
Technical Notes:
Structure: terraform/environments/dev/, terraform/modules/
Lock state file with DynamoDB (optional but recommended)
Use .tfvars for environment-specific values

TICKET TH-508: VPC & Networking with Terraform
Type: DevOps | Priority: High | Estimate: 4 hours
Description: Create VPC and networking infrastructure.
Acceptance Criteria:
VPC with CIDR 10.0.0.0/16
2 public subnets (for ALB)
2 private subnets (for EKS, RDS)
Internet Gateway for public subnets
NAT Gateway for private subnets
Route tables configured
terraform apply creates all resources
Technical Notes:
Use multiple AZs for high availability
Tag all resources for cost tracking
Consider VPC module from Terraform registry

TICKET TH-509: RDS PostgreSQL with Terraform
Type: DevOps | Priority: High | Estimate: 3 hours
Description: Provision RDS PostgreSQL database.
Acceptance Criteria:
RDS PostgreSQL 15 instance created
db.t3.micro for dev (free tier eligible)
In private subnet (no public access)
Security group allows access from EKS only
Automated backups enabled
Credentials stored in AWS Secrets Manager
Technical Notes:
Enable encryption at rest
Configure maintenance window
Don't use master password in Terraform state

TICKET TH-510: ElastiCache Redis with Terraform
Type: DevOps | Priority: High | Estimate: 2 hours
Description: Provision ElastiCache Redis cluster.
Acceptance Criteria:
ElastiCache Redis 7 cluster created
cache.t3.micro for dev
In private subnet
Security group allows access from EKS only
Auth token configured
Technical Notes:
Single node for dev, cluster mode for prod
Enable encryption in transit
Consider snapshot for backup

TICKET TH-511: ECR Repository with Terraform
Type: DevOps | Priority: High | Estimate: 1 hour
Description: Create ECR repository for Docker images.
Acceptance Criteria:
ECR repository created
Image scanning enabled
Lifecycle policy removes old images
Can push/pull images
Technical Notes:
Enable image scanning on push
Set lifecycle to keep last 10 images
Document push commands in README

TICKET TH-512: EKS Cluster with Terraform
Type: DevOps | Priority: High | Estimate: 6 hours
Description: Provision EKS cluster for production workloads.
Acceptance Criteria:
EKS cluster created in private subnets
Managed node group with 2 nodes (t3.small)
kubectl configured to access cluster
Cluster add-ons installed (VPC CNI, CoreDNS, kube-proxy)
OIDC provider configured for IAM roles
Technical Notes:
EKS is expensive - consider running only when needed
Use Terraform EKS module for simplicity
Enable cluster logging to CloudWatch

TICKET TH-513: Deploy Application to EKS
Type: DevOps | Priority: High | Estimate: 4 hours
Description: Deploy application to EKS cluster.
Acceptance Criteria:
Update Kubernetes manifests for EKS
Configure secrets from AWS Secrets Manager
Application connects to RDS and ElastiCache
Application accessible via ALB
Health checks passing
Technical Notes:
Use AWS Load Balancer Controller for ALB
Configure IAM roles for service accounts
Use external-secrets operator for AWS Secrets Manager

TICKET TH-514: Configure ALB & DNS
Type: DevOps | Priority: Medium | Estimate: 3 hours
Description: Set up Application Load Balancer and optional DNS.
Acceptance Criteria:
ALB created via Kubernetes Ingress
HTTPS enabled with ACM certificate
HTTP redirects to HTTPS
Health checks configured
(Optional) Custom domain configured in Route 53
Technical Notes:
Use AWS Load Balancer Controller annotations
Free SSL with AWS Certificate Manager
Custom domain optional but impressive for portfolio

PHASE 6: CI/CD, TESTING & DOCUMENTATION (Week 6)

EPIC: CI/CD Pipeline
TICKET TH-601: GitHub Actions Workflow - Build & Test
Type: DevOps | Priority: High | Estimate: 3 hours
Description: Create GitHub Actions workflow for automated build and test.
Acceptance Criteria:
Workflow triggers on push to main and pull requests
Runs Maven build
Runs all unit tests
Runs integration tests
Build artifacts cached
Build status badge in README
Technical Notes:
Use actions/setup-java with Java 17
Cache Maven dependencies
Fail fast on test failures

TICKET TH-602: Security Scanning in CI
Type: DevOps | Priority: High | Estimate: 2 hours
Description: Add security scanning to CI pipeline.
Acceptance Criteria:
OWASP Dependency Check runs in CI
Build fails on high severity vulnerabilities
Report uploaded as artifact
Snyk or similar for container scanning
Technical Notes:
Use OWASP Dependency Check Maven plugin
Configure suppression file for false positives
Run weekly full scan

TICKET TH-603: Docker Build & Push in CI
Type: DevOps | Priority: High | Estimate: 2 hours
Description: Automate Docker image building and pushing to ECR.
Acceptance Criteria:
Docker image built in CI
Image tagged with git SHA and 'latest'
Image pushed to ECR
Only runs on main branch (not PRs)
ECR credentials via OIDC (not long-lived keys)
Technical Notes:
Use aws-actions/amazon-ecr-login
Configure GitHub OIDC provider in AWS
Consider multi-arch builds if needed

TICKET TH-604: Automated Deployment to Staging
Type: DevOps | Priority: High | Estimate: 3 hours
Description: Automate deployment to staging environment.
Acceptance Criteria:
Deployment triggered after successful image push
Kubernetes manifests applied to staging namespace
Deployment waits for rollout to complete
Smoke tests run after deployment
Rollback on failed smoke tests
Technical Notes:
Use separate namespace for staging
Consider ArgoCD for GitOps (stretch goal)
Keep staging config in separate branch or folder

TICKET TH-605: Production Deployment with Approval
Type: DevOps | Priority: High | Estimate: 2 hours
Description: Add manual approval gate for production deployments.
Acceptance Criteria:
Production deployment requires manual approval
Approvers notified via GitHub
Deployment only proceeds after approval
Audit trail of who approved
Same image deployed to prod as tested in staging
Technical Notes:
Use GitHub Environments with protection rules
Configure required reviewers
Add deployment notification to Slack (optional)

EPIC: Testing
TICKET TH-606: Unit Tests for Services
Type: Testing | Priority: High | Estimate: 6 hours
Description: Write comprehensive unit tests for all service classes.
Acceptance Criteria:
VenueService: 90%+ coverage
EventService: 90%+ coverage
BookingService: 90%+ coverage
PaymentService: 90%+ coverage
All edge cases covered
Tests follow AAA pattern (Arrange, Act, Assert)
Technical Notes:
Use Mockito for mocking dependencies
Test happy path and error scenarios
Use @DisplayName for readable test names

TICKET TH-607: Integration Tests for Booking Flow
Type: Testing | Priority: High | Estimate: 4 hours
Description: Write integration tests for the complete booking flow.
Acceptance Criteria:
Test creates user, event, venue, and booking
Tests use real database (Testcontainers)
Concurrent booking test proves no overselling
Payment webhook handling tested
Test cleanup handled properly
Technical Notes:
Use Testcontainers for PostgreSQL and Redis
Use @SpringBootTest for full context
Consider test profiles for isolation

TICKET TH-608: Code Coverage Report
Type: Testing | Priority: Medium | Estimate: 2 hours
Description: Set up JaCoCo for code coverage reporting.
Acceptance Criteria:
JaCoCo plugin configured in Maven
Coverage report generated on build
Coverage thresholds enforced (70% minimum)
Report uploaded in CI
Coverage badge in README
Technical Notes:
Exclude DTOs and config classes from coverage
Configure in both build and CI
Consider Codecov integration for PR comments

EPIC: Documentation
TICKET TH-609: Swagger/OpenAPI Documentation
Type: Documentation | Priority: High | Estimate: 3 hours
Description: Add interactive API documentation.
Acceptance Criteria:
Springdoc OpenAPI dependency added
Swagger UI available at /swagger-ui.html
All endpoints documented
Request/response examples provided
Authentication documented (JWT bearer token)
Technical Notes:
Use @Operation, @ApiResponse annotations
Group endpoints by tag
Include error response schemas

TICKET TH-610: Comprehensive README
Type: Documentation | Priority: High | Estimate: 4 hours
Description: Write portfolio-quality README documentation.
Acceptance Criteria:
Project overview and features
Architecture diagram
Technology stack with justifications
Local development setup instructions
API endpoint summary
Screenshots or GIFs
Deployment instructions
Future roadmap
Contact/LinkedIn link
Technical Notes:
Use Mermaid for architecture diagrams
Keep instructions up to date
Add troubleshooting section

TICKET TH-611: Architecture Decision Records
Type: Documentation | Priority: Medium | Estimate: 3 hours
Description: Document key architectural decisions.
Acceptance Criteria:
ADR template created
ADR for: database choice, locking strategy, payment provider, cloud provider, containerization
Each ADR includes: context, decision, consequences
ADRs stored in docs/adr/ folder
Technical Notes:
Use standard ADR format
Great for interview discussions
Keep concise but informative

EPIC: Demo & Portfolio
TICKET TH-612: Record Demo Video
Type: Marketing | Priority: High | Estimate: 4 hours
Description: Create professional demo video for portfolio.
Acceptance Criteria:
5-10 minute video length
Shows: user registration, event browsing, booking flow, payment, confirmation
Explains technical highlights (concurrency, deployment)
Professional audio quality
Uploaded to YouTube (unlisted or public)
Technical Notes:
Script the demo beforehand
Use Loom or OBS for recording
Edit out mistakes
Add captions if possible

TICKET TH-613: Update Resume & LinkedIn
Type: Marketing | Priority: High | Estimate: 2 hours
Description: Update professional profiles with project.
Acceptance Criteria:
Resume updated with quantifiable achievements
LinkedIn project section added
GitHub pinned repository
Include key technologies
Link to live demo (if deployed)
Technical Notes:
Quantify: "handles 1000+ concurrent users", "99.9% uptime"
Use action verbs: "Architected", "Implemented", "Deployed"
Tailor descriptions for target roles

FUTURE ENHANCEMENTS (Post-MVP)

TICKET TH-701: Message Queue Integration (Kafka/SQS)
Type: Feature | Priority: Low | Estimate: 8 hours
Description: Add message queue for async processing.
Acceptance Criteria:
Kafka or SQS configured
Email notifications sent via queue
Booking events published for analytics
Dead letter queue for failed messages
Consumer retry logic implemented

TICKET TH-702: QR Code Generation
Type: Feature | Priority: Low | Estimate: 4 hours
Description: Generate unique QR codes for tickets.
Acceptance Criteria:
QR code generated per booking
Contains booking reference encoded
Stored in S3
Included in confirmation email
Scannable for venue entry

TICKET TH-703: Admin Dashboard API
Type: Feature | Priority: Low | Estimate: 6 hours
Description: Create admin analytics endpoints.
Acceptance Criteria:
GET /api/admin/analytics/sales - Sales overview
GET /api/admin/analytics/events/{id} - Event-specific stats
Include: revenue, bookings count, tickets sold
Date range filtering
Export to CSV

TICKET TH-704: Waitlist System
Type: Feature | Priority: Low | Estimate: 6 hours
Description: Allow users to join waitlist for sold-out events.
Acceptance Criteria:
POST /api/events/{id}/waitlist - Join waitlist
FIFO order maintained
Notify users when tickets available
Time-limited offer (1 hour to book)
Auto-remove from waitlist after offer expires

TICKET TH-705: Prometheus & Grafana Monitoring
Type: DevOps | Priority: Low | Estimate: 6 hours
Description: Advanced monitoring and dashboards.
Acceptance Criteria:
Prometheus deployed to Kubernetes
Grafana deployed with pre-built dashboards
Custom business metrics (bookings/min, revenue)
Alerting rules configured
Dashboard accessible via URL

FRONTEND (Optional Stretch Goal)

TICKET TH-801: React App Setup
Type: Feature | Priority: Low | Estimate: 4 hours
Description: Create basic React frontend for demo purposes.
Acceptance Criteria:
React app with TypeScript
Tailwind CSS for styling
Router for navigation
API client configured
Basic responsive layout

TICKET TH-802: Event Listing Page
Type: Feature | Priority: Low | Estimate: 4 hours
Description: Build event browsing UI.
Acceptance Criteria:
Grid/list view of events
Search bar
Category filters
Pagination
Click to view details

TICKET TH-803: Event Detail & Booking Page
Type: Feature | Priority: Low | Estimate: 6 hours
Description: Build event details and booking UI.
Acceptance Criteria:
Event details display
Quantity selector
Stripe payment form
Loading states
Success/error handling

TICKET TH-804: User Dashboard
Type: Feature | Priority: Low | Estimate: 4 hours
Description: Build user profile and bookings view.
Acceptance Criteria:
Login/register forms
My bookings list
Booking details modal
Cancel booking option
Profile settings

SUMMARY
Total Tickets: 65+ Critical Path: TH-201 → TH-205 → TH-301 → TH-303 → TH-405 → TH-512 → TH-601
Week 2 Focus: Venues & Events (10 tickets) Week 3 Focus: Booking with DB Locking (6 tickets) Week 4 Focus: Docker, Redis, Payments (13 tickets) Week 5 Focus: Kubernetes & AWS (14 tickets) Week 6 Focus: CI/CD, Testing, Docs (13 tickets)
Key Interview Talking Points:
Double-locking strategy (Redis + PostgreSQL)
Stripe webhook handling with idempotency
Terraform-managed AWS infrastructure
Kubernetes deployment with HPA
CI/CD with manual production approval

Ready to start with TH-201 (Venue Entity)?
we also need to simulate a situation where we have multiple users so my app can break etc so i can learn how app work in production etc , concurrent and multiple request etc
we also need to simulate a situation where we have multiple users so my app can break etc so i can learn how app work in production etc , concurrent and multiple request etc
Editing this message will create a new conversation branch. You can switch between branches using the arrow navigation buttons.
CancelSave
Great thinking! You're absolutely right — you need to stress test your application to see how it behaves under real-world conditions. This is actually one of the most impressive things you can demonstrate in interviews.
Let me add tickets for that. But first, let me ask you:
What do you think could go wrong when 100 users try to book the last 5 tickets at the exact same time?
Think about:
What happens at the database level?
What happens if two requests read "5 tickets available" at the same moment?
How would you even simulate this scenario?
Walk me through your thinking, then I'll add the load testing and chaos engineering tickets to make your project truly production-ready.
add to the ticket when we get there we we talk about it
write the write well now eveything well detaild ticket as a PR AND ENGINEEERING MANAGER NO CODE ATALL JUST THE TICKET , we talk about the coee when i am tackling the tickrt
5:48 AM
3 / 3
Got it! Here's the complete, detailed ticket breakdown — no code, just pure PM/Engineering Manager documentation.

TICKETHUB PROJECT TICKETS
Master Document v1.0
Project: TicketHub - Cloud-Native Event Ticketing Platform Timeline: 6 Weeks (Phases 2-6 remaining) Current Status: Phase 1 Complete (User Authentication with JWT) Document Owner: Engineering Manager Last Updated: January 2025

PROJECT OVERVIEW
Completed Work (Phase 1)
Project setup with Spring Boot 3.2.1, Java 17, Maven
PostgreSQL database connection configured
User entity with Role enum (USER, ADMIN)
User registration endpoint
User login endpoint with JWT token generation
Password hashing with BCrypt
Global exception handling
Basic project structure (Controller → Service → Repository)
Remaining Work Summary
Phase 2: Venue & Event Management (Week 2)
Phase 3: Booking System with Database Locking (Week 3)
Phase 4: Docker, Redis, Payments & Email (Week 4)
Phase 5: Kubernetes & AWS Infrastructure (Week 5)
Phase 6: CI/CD, Testing, Load Testing & Documentation (Week 6)
Critical Path
TH-201 → TH-205 → TH-301 → TH-303 → TH-405 → TH-512 → TH-601 → TH-615

PHASE 2: VENUE & EVENT MANAGEMENT
Duration: Week 2 Goal: Build the foundation for events — venues where events happen and events themselves Dependencies: Phase 1 (User Authentication) must be complete Deliverables: Full CRUD for venues and events, search, filtering, pagination

EPIC: VENUE MANAGEMENT
TH-201: Create Venue Entity & Repository
Type: Feature Priority: High Estimate: 3 hours Assignee: Developer Labels: backend, database, entity
Summary: Create the Venue entity that represents physical locations where events take place. This is foundational — every event must have a venue.
Business Context: Venues are physical locations (stadiums, theaters, arenas) that host events. We need to store venue information separately from events because one venue hosts many events over time. This prevents data duplication and allows updates to venue info to reflect across all events.
Acceptance Criteria:
Venue entity exists with all required fields
VenueRepository interface extends JpaRepository
Entity uses proper JPA annotations
Audit fields auto-populate on create/update
Entity can be saved and retrieved via repository
All fields have appropriate column constraints
Required Fields:
id (Long, auto-generated primary key)
name (String, required, max 200 characters)
address (String, required, max 500 characters)
city (String, required, max 100 characters)
state (String, required, max 100 characters)
zipCode (String, required, max 20 characters)
country (String, required, max 100 characters, default "USA")
capacity (Integer, required, minimum 1)
description (String, optional, max 2000 characters)
imageUrl (String, optional, max 500 characters)
contactEmail (String, optional, valid email format)
contactPhone (String, optional, max 20 characters)
createdAt (LocalDateTime, auto-generated)
updatedAt (LocalDateTime, auto-updated)
Technical Considerations:
Use @Entity and @Table annotations
Use @Id and @GeneratedValue for primary key
Use @Column with nullable and length constraints
Use @CreationTimestamp and @UpdateTimestamp from Hibernate
Consider adding @Builder from Lombok for easy construction
Table name should be "venues"
Out of Scope:
API endpoints (separate ticket)
DTOs (separate ticket)
Validation logic (separate ticket)
Testing Requirements:
Repository can save a venue
Repository can find venue by ID
Repository can find all venues
Audit fields populate correctly
Definition of Done:
Entity class created with all fields
Repository interface created
Code compiles without errors
Basic repository test passes
Code reviewed and merged

TH-202: Venue DTOs & Validation
Type: Feature Priority: High Estimate: 2 hours Assignee: Developer Labels: backend, dto, validation Blocked By: TH-201
Summary: Create Data Transfer Objects for Venue API operations. DTOs separate the API contract from the database entity, allowing independent evolution and proper validation.
Business Context: We never expose database entities directly to the API. DTOs allow us to control exactly what data comes in and goes out, add validation rules, and version our API independently from database changes.
Acceptance Criteria:
CreateVenueRequest DTO with validation annotations
UpdateVenueRequest DTO with validation annotations
VenueResponse DTO for API responses
VenueSummaryResponse DTO for list views (lighter payload)
VenueMapper class converts between Entity and DTOs
All validation messages are user-friendly
Validation errors return proper field-level error details
DTO Specifications:
CreateVenueRequest:
name (required, 1-200 chars)
address (required, 1-500 chars)
city (required, 1-100 chars)
state (required, 1-100 chars)
zipCode (required, 1-20 chars)
country (optional, defaults to "USA")
capacity (required, minimum 1, maximum 500000)
description (optional, max 2000 chars)
imageUrl (optional, valid URL format)
contactEmail (optional, valid email format)
contactPhone (optional, max 20 chars)
UpdateVenueRequest:
Same as CreateVenueRequest but all fields optional
Only provided fields are updated
VenueResponse (full details):
id
name
address
city
state
zipCode
country
capacity
description
imageUrl
contactEmail
contactPhone
createdAt
updatedAt
VenueSummaryResponse (for lists):
id
name
city
state
capacity
Technical Considerations:
Use Jakarta validation annotations (@NotBlank, @Size, @Min, @Max, @Email, @URL)
Create validation messages in messages.properties for i18n support
VenueMapper can be manual or use MapStruct library
Consider using @Builder on DTOs for easy construction
Testing Requirements:
Validation rejects invalid input
Validation accepts valid input
Mapper correctly converts entity to response
Mapper correctly converts request to entity
Definition of Done:
All DTO classes created
Validation annotations applied
Mapper class implemented
Validation messages are user-friendly
Code reviewed and merged

TH-203: Venue Service Layer
Type: Feature Priority: High Estimate: 2 hours Assignee: Developer Labels: backend, service, business-logic Blocked By: TH-201, TH-202
Summary: Implement the business logic layer for venue operations. The service layer contains all business rules and orchestrates between controllers and repositories.
Business Context: The service layer is where business logic lives. It validates business rules (not just input validation), coordinates database operations, and provides a clean interface for controllers. This separation makes the code testable and maintainable.
Acceptance Criteria:
VenueService interface defines all operations
VenueServiceImpl implements the interface
All methods handle errors gracefully
ResourceNotFoundException thrown when venue not found
Service is fully unit tested with mocks
Duplicate venue name handling (optional: warn or prevent)
Required Methods:
createVenue(CreateVenueRequest request) → VenueResponse
Converts request to entity
Saves to database
Returns response DTO
getVenueById(Long id) → VenueResponse
Finds venue by ID
Throws ResourceNotFoundException if not found
Returns response DTO
getAllVenues() → List<VenueSummaryResponse>
Returns all venues as summary DTOs
Ordered by name alphabetically
getAllVenuesPaginated(Pageable pageable) → Page<VenueSummaryResponse>
Returns paginated venue list
Supports sorting
updateVenue(Long id, UpdateVenueRequest request) → VenueResponse
Finds existing venue
Updates only provided fields
Saves and returns updated response
deleteVenue(Long id) → void
Finds existing venue
Deletes from database
Throws ResourceNotFoundException if not found
Future consideration: prevent deletion if venue has events
Technical Considerations:
Use constructor injection for dependencies
Use @Service annotation
Use @Transactional where appropriate
Handle Optional properly with orElseThrow
Log important operations
Testing Requirements:
Unit tests for all methods
Mock repository in tests
Test happy path scenarios
Test error scenarios (not found, validation)
Achieve 90%+ code coverage for service
Definition of Done:
Interface created
Implementation complete
All methods working
Unit tests passing
Code coverage > 90%
Code reviewed and merged

TH-204: Venue REST Controller
Type: Feature Priority: High Estimate: 3 hours Assignee: Developer Labels: backend, api, controller Blocked By: TH-203
Summary: Create REST API endpoints for venue management with proper authorization. Admin users can create, update, and delete venues. All users can view venues.
Business Context: These endpoints allow the frontend (and API consumers) to manage venues. We enforce role-based access — only admins can modify venues, but anyone can view them. This protects data integrity while allowing public browsing.
Acceptance Criteria:
All endpoints follow REST conventions
Admin endpoints require ADMIN role
Public endpoints work without authentication
Proper HTTP status codes returned
Validation errors return 400 with details
Not found returns 404
All endpoints tested with Postman
API Endpoints:
POST /api/admin/venues
Creates a new venue
Requires: ADMIN role
Request Body: CreateVenueRequest
Success Response: 201 Created with VenueResponse
Error Response: 400 Bad Request with validation errors
GET /api/venues
Lists all venues (paginated)
Requires: None (public)
Query Params: page, size, sort
Success Response: 200 OK with Page<VenueSummaryResponse>
GET /api/venues/{id}
Gets venue details by ID
Requires: None (public)
Path Param: id (Long)
Success Response: 200 OK with VenueResponse
Error Response: 404 Not Found
PUT /api/admin/venues/{id}
Updates existing venue
Requires: ADMIN role
Path Param: id (Long)
Request Body: UpdateVenueRequest
Success Response: 200 OK with VenueResponse
Error Response: 404 Not Found, 400 Bad Request
DELETE /api/admin/venues/{id}
Deletes venue
Requires: ADMIN role
Path Param: id (Long)
Success Response: 204 No Content
Error Response: 404 Not Found
GET /api/venues/search
Searches venues by city or name
Requires: None (public)
Query Params: query, page, size
Success Response: 200 OK with Page<VenueSummaryResponse>
Technical Considerations:
Use @RestController and @RequestMapping
Use @PreAuthorize("hasRole('ADMIN')") for admin endpoints
Use @Valid for request body validation
Return ResponseEntity with appropriate status codes
Use @PathVariable and @RequestParam appropriately
Consider adding @Tag for Swagger documentation
Testing Requirements:
Test all endpoints with Postman
Test authentication/authorization
Test validation errors
Test not found scenarios
Document in Postman collection
Definition of Done:
All endpoints implemented
Authorization working correctly
Validation working correctly
Postman collection created
All tests passing
Code reviewed and merged

EPIC: EVENT MANAGEMENT
TH-205: Create Event Entity with Relationships
Type: Feature Priority: High Estimate: 4 hours Assignee: Developer Labels: backend, database, entity, relationships Blocked By: TH-201
Summary: Create the Event entity with relationships to Venue (where it happens) and User (who created it). This is a core entity that represents concerts, games, shows, etc.
Business Context: Events are the core of our platform — they're what users browse and book tickets for. Each event happens at a specific venue and is created by an admin user. We need to track ticket inventory to prevent overselling.
Acceptance Criteria:
Event entity created with all required fields
ManyToOne relationship to Venue established
ManyToOne relationship to User (creator) established
EventStatus enum created with all states
EventCategory enum created with all categories
Foreign key constraints properly defined
Entity can be saved with associated Venue and User
Cascade and fetch settings appropriate
Required Fields:
id (Long, auto-generated primary key)
name (String, required, max 300 characters)
description (String, required, max 5000 characters)
artistName (String, optional, max 200 characters)
eventDateTime (LocalDateTime, required, must be future)
endDateTime (LocalDateTime, optional)
price (BigDecimal, required, precision 10 scale 2, minimum 0)
totalTickets (Integer, required, minimum 1)
availableTickets (Integer, required, starts equal to totalTickets)
imageUrl (String, optional, max 500 characters)
status (EventStatus enum, required, default DRAFT)
category (EventCategory enum, required)
venue (Venue entity, required, ManyToOne)
createdBy (User entity, required, ManyToOne)
createdAt (LocalDateTime, auto-generated)
updatedAt (LocalDateTime, auto-updated)
EventStatus Enum Values:
DRAFT (newly created, not visible to public)
PUBLISHED (visible and bookable)
SOLD_OUT (no tickets available)
CANCELLED (event cancelled)
COMPLETED (event has happened)
EventCategory Enum Values:
MUSIC
SPORTS
THEATER
COMEDY
FESTIVAL
CONFERENCE
EXHIBITION
OTHER
Relationship Details:
Event → Venue (ManyToOne):
Many events can happen at one venue
Event must have a venue
Use @JoinColumn(name = "venue_id")
Fetch type: LAZY
Event → User (ManyToOne):
Many events can be created by one admin
Event must have a creator
Use @JoinColumn(name = "created_by_user_id")
Fetch type: LAZY
Technical Considerations:
Use @Enumerated(EnumType.STRING) for enums
Use BigDecimal for price (never use double for money)
availableTickets must be updated atomically during booking
Consider adding version field for optimistic locking
Table name should be "events"
Add index on eventDateTime and status for common queries
Out of Scope:
Ticket entity (Phase 3)
Booking logic (Phase 3)
API endpoints (separate ticket)
Testing Requirements:
Entity can be saved with venue and user
Relationships load correctly
Enum values persist as strings
Constraints enforced at database level
Definition of Done:
Entity class created with all fields
Enums created
Relationships configured
Code compiles without errors
Basic persistence test passes
Code reviewed and merged

TH-206: Event DTOs & Mapper
Type: Feature Priority: High Estimate: 3 hours Assignee: Developer Labels: backend, dto, validation Blocked By: TH-205
Summary: Create Data Transfer Objects for Event API operations. Events have more complex DTOs due to relationships and the various views needed.
Business Context: Event DTOs need to handle nested objects (venue info), different levels of detail (list vs detail view), and proper validation for business rules (future dates, positive prices, etc.).
Acceptance Criteria:
CreateEventRequest DTO with all validations
UpdateEventRequest DTO with partial update support
EventResponse DTO with nested venue summary
EventSummaryResponse DTO for list views
EventMapper handles all conversions
Validation enforces business rules
Error messages are user-friendly
DTO Specifications:
CreateEventRequest:
name (required, 1-300 chars)
description (required, 1-5000 chars)
artistName (optional, max 200 chars)
eventDateTime (required, must be future date)
endDateTime (optional, must be after eventDateTime)
price (required, minimum 0, max 99999.99)
totalTickets (required, minimum 1, maximum venue capacity)
imageUrl (optional, valid URL)
category (required, valid enum value)
venueId (required, must exist)
UpdateEventRequest:
All fields optional
Only provided fields updated
Cannot update: totalTickets if bookings exist (business rule)
Cannot update: venueId if bookings exist (business rule)
EventResponse (full details):
id
name
description
artistName
eventDateTime
endDateTime
price
totalTickets
availableTickets
imageUrl
status
category
venue (VenueSummaryResponse - nested)
createdByName (just the name, not full user)
createdAt
updatedAt
EventSummaryResponse (for lists):
id
name
artistName
eventDateTime
price
availableTickets
imageUrl
status
category
venueName
venueCity
Technical Considerations:
Use @Future for eventDateTime validation
Use @DecimalMin and @DecimalMax for price
VenueId validated in service layer (not DTO)
Consider custom validator for endDateTime > eventDateTime
Don't expose createdBy user ID for security
Testing Requirements:
Validation rejects past dates
Validation rejects negative prices
Mapper correctly handles nested venue
Mapper correctly handles null optional fields
Definition of Done:
All DTO classes created
Validation annotations applied
Mapper handles all cases
Custom validators if needed
Code reviewed and merged

TH-207: Event Service Layer
Type: Feature Priority: High Estimate: 4 hours Assignee: Developer Labels: backend, service, business-logic Blocked By: TH-205, TH-206
Summary: Implement business logic for event management. This includes complex business rules around event lifecycle, ticket management, and status transitions.
Business Context: Events have a lifecycle: DRAFT → PUBLISHED → SOLD_OUT/COMPLETED or CANCELLED. Business rules govern what actions are allowed in each state. The service layer enforces these rules.
Acceptance Criteria:
EventService interface with all operations
EventServiceImpl with business logic
Status transition rules enforced
Creator automatically set from security context
Venue validation (exists, capacity)
Proper error handling and exceptions
Full unit test coverage
Required Methods:
createEvent(CreateEventRequest request) → EventResponse
Validates venue exists
Validates totalTickets <= venue capacity
Sets availableTickets = totalTickets
Gets current user from SecurityContext and sets as creator
Sets status to DRAFT
Saves and returns response
getEventById(Long id) → EventResponse
Finds event by ID
Throws ResourceNotFoundException if not found
Public view only returns PUBLISHED events (or ADMIN sees all)
getAllPublishedEvents(Pageable pageable) → Page<EventSummaryResponse>
Returns only PUBLISHED status events
Ordered by eventDateTime ascending (soonest first)
Supports pagination
getEventsByCategory(EventCategory category, Pageable pageable) → Page<EventSummaryResponse>
Filters by category
Only PUBLISHED events
Paginated
updateEvent(Long id, UpdateEventRequest request) → EventResponse
Finds existing event
Business rules:
Can freely update DRAFT events
PUBLISHED events: limited updates allowed
CANCELLED/COMPLETED events: no updates
Updates only provided fields
Returns updated event
publishEvent(Long id) → EventResponse
Changes status from DRAFT to PUBLISHED
Business rules:
Only DRAFT events can be published
Event must have future date
Event must have tickets available
Returns updated event
cancelEvent(Long id) → EventResponse
Changes status to CANCELLED
Business rules:
Cannot cancel COMPLETED events
Future: Should notify booked users (Phase 4)
Future: Should trigger refunds (Phase 4)
Returns updated event
searchEvents(String query, Pageable pageable) → Page<EventSummaryResponse>
Searches by name or artistName
Case-insensitive partial match
Only PUBLISHED events
Paginated
getMyCreatedEvents(Pageable pageable) → Page<EventSummaryResponse>
Returns events created by current user
All statuses
For admin dashboard
Technical Considerations:
Use SecurityContextHolder to get current user
Use @Transactional for write operations
Create custom exceptions (EventNotPublishedException, InvalidStatusTransitionException)
Log state transitions for audit trail
Consider event sourcing pattern for status history (future enhancement)
Status Transition Rules:
DRAFT → PUBLISHED (via publishEvent)
DRAFT → CANCELLED (via cancelEvent)
PUBLISHED → SOLD_OUT (automatic when availableTickets = 0)
PUBLISHED → CANCELLED (via cancelEvent)
PUBLISHED → COMPLETED (automatic after event date passes - via scheduled job)
SOLD_OUT → PUBLISHED (if tickets become available via cancellation)
SOLD_OUT → CANCELLED (via cancelEvent)
SOLD_OUT → COMPLETED (automatic after event date)
Testing Requirements:
Test all methods with mocks
Test status transition rules
Test business rule enforcement
Test error scenarios
90%+ code coverage
Definition of Done:
Interface created
Implementation complete
Status transitions enforced
Business rules enforced
Unit tests passing
Code reviewed and merged

TH-208: Event REST Controller
Type: Feature Priority: High Estimate: 3 hours Assignee: Developer Labels: backend, api, controller Blocked By: TH-207
Summary: Create REST API endpoints for event management. Admins can create and manage events. Public users can browse published events.
Business Context: These endpoints power the main user experience — browsing events, viewing details, and (for admins) managing the event catalog.
Acceptance Criteria:
All endpoints follow REST conventions
Admin endpoints require ADMIN role
Public endpoints show only PUBLISHED events
Proper HTTP status codes
Validation errors handled properly
All endpoints tested with Postman
API Endpoints:
POST /api/admin/events
Creates a new event (DRAFT status)
Requires: ADMIN role
Request Body: CreateEventRequest
Success: 201 Created with EventResponse
Error: 400 Bad Request, 404 Venue Not Found
GET /api/events
Lists published events (paginated)
Requires: None (public)
Query Params: page, size, sort, category
Success: 200 OK with Page<EventSummaryResponse>
GET /api/events/{id}
Gets event details
Requires: None (public, but only PUBLISHED visible)
Path Param: id
Success: 200 OK with EventResponse
Error: 404 Not Found (or not published)
PUT /api/admin/events/{id}
Updates event
Requires: ADMIN role
Request Body: UpdateEventRequest
Success: 200 OK with EventResponse
Error: 400 Bad Request, 404 Not Found, 409 Conflict (invalid state)
PATCH /api/admin/events/{id}/publish
Publishes event
Requires: ADMIN role
Success: 200 OK with EventResponse
Error: 404 Not Found, 409 Conflict (invalid state transition)
PATCH /api/admin/events/{id}/cancel
Cancels event
Requires: ADMIN role
Success: 200 OK with EventResponse
Error: 404 Not Found, 409 Conflict
DELETE /api/admin/events/{id}
Deletes event (only DRAFT events)
Requires: ADMIN role
Success: 204 No Content
Error: 404 Not Found, 409 Conflict (cannot delete published)
GET /api/events/search
Searches events
Requires: None (public)
Query Params: q (search query), page, size
Success: 200 OK with Page<EventSummaryResponse>
GET /api/admin/events
Lists all events for admin (all statuses)
Requires: ADMIN role
Query Params: page, size, status
Success: 200 OK with Page<EventSummaryResponse>
GET /api/admin/events/my-events
Lists events created by current admin
Requires: ADMIN role
Success: 200 OK with Page<EventSummaryResponse>
Technical Considerations:
Use @RestController
Use @PreAuthorize for role checks
Use @Valid for request validation
Return appropriate ResponseEntity status codes
Add Swagger annotations for documentation
Testing Requirements:
Postman collection with all endpoints
Test auth/authz scenarios
Test status transition errors
Test search functionality
Definition of Done:
All endpoints implemented
Authorization enforced
Validation working
Postman collection updated
Code reviewed and merged

TH-209: Event Pagination & Sorting
Type: Feature Priority: Medium Estimate: 2 hours Assignee: Developer Labels: backend, api, pagination Blocked By: TH-208
Summary: Implement consistent pagination and sorting across event endpoints with a standardized response format.
Business Context: When we have thousands of events, we can't return them all at once. Pagination lets clients request data in chunks. Consistent pagination format makes frontend development easier.
Acceptance Criteria:
All list endpoints support pagination
Configurable page size with sensible limits
Multiple sort options available
Consistent PagedResponse wrapper
Pagination metadata included in response
Default values applied when not specified
Pagination Parameters:
page: Page number (0-indexed, default 0)
size: Items per page (default 20, min 1, max 100)
sort: Sort field and direction (e.g., "eventDateTime,asc")
Sortable Fields:
eventDateTime (default, ascending)
price (ascending or descending)
name (alphabetical)
createdAt (newest first for admin)
availableTickets (for "almost sold out" view)
PagedResponse<T> Structure:
content: List<T> (the actual data)
page: current page number
size: items per page
totalElements: total items across all pages
totalPages: total number of pages
first: boolean (is this the first page?)
last: boolean (is this the last page?)
hasNext: boolean
hasPrevious: boolean
Technical Considerations:
Use Spring's Pageable interface
Use Page<T> from Spring Data
Create reusable PagedResponse<T> wrapper
Validate page size limits
Consider cursor-based pagination for very large datasets (future)
Testing Requirements:
Test default pagination values
Test custom page sizes
Test sorting options
Test edge cases (empty results, last page)
Definition of Done:
PagedResponse wrapper created
All list endpoints paginated
Sorting implemented
Default values working
Code reviewed and merged

TH-210: Event Search & Filtering
Type: Feature Priority: Medium Estimate: 4 hours Assignee: Developer Labels: backend, api, search Blocked By: TH-209
Summary: Implement comprehensive search and filtering for events. Users should be able to find events by multiple criteria simultaneously.
Business Context: Users need to find events that match their interests, location, budget, and schedule. Good search and filtering dramatically improves user experience and conversion.
Acceptance Criteria:
Search by name (partial match, case-insensitive)
Search by artist name
Filter by category
Filter by city (from venue)
Filter by date range
Filter by price range
All filters combinable
Filters work with pagination
Results relevance-ranked
Filter Parameters:
GET /api/events
q: Search query (searches name and artistName)
category: EventCategory enum value
city: City name (partial match)
startDate: Events on or after this date (ISO format)
endDate: Events on or before this date (ISO format)
minPrice: Minimum ticket price
maxPrice: Maximum ticket price
status: Event status (admin only)
Example Queries:
/api/events?category=MUSIC&city=New York
/api/events?q=taylor&minPrice=50&maxPrice=200
/api/events?startDate=2025-02-01&endDate=2025-02-28
/api/events?category=SPORTS&city=Los Angeles&minPrice=0&maxPrice=100
Technical Considerations:
Use Spring Data JPA Specifications for dynamic queries
Or use Criteria API for complex filters
Consider adding database indexes:
idx_events_category
idx_events_event_date_time
idx_events_status
idx_venues_city (for join queries)
ILIKE for case-insensitive search (PostgreSQL)
Optimize queries to avoid N+1 problems
Search Behavior:
Empty query returns all (with other filters)
Search terms are AND-ed
Partial matches allowed for text fields
Date range is inclusive
Price range is inclusive
Testing Requirements:
Test each filter individually
Test filter combinations
Test empty results
Test with pagination
Performance test with large dataset
Definition of Done:
All filters implemented
Filters combinable
Works with pagination
Database indexes added
Query performance acceptable
Code reviewed and merged

TH-211: Event Status Auto-Update Job
Type: Feature Priority: Medium Estimate: 2 hours Assignee: Developer Labels: backend, scheduled-job Blocked By: TH-207
Summary: Create scheduled job to automatically update event statuses based on conditions (e.g., mark past events as COMPLETED).
Business Context: We don't want admins to manually mark events as completed after they happen. The system should automatically transition events to appropriate states.
Acceptance Criteria:
Scheduled job runs on configurable schedule
PUBLISHED events past their date → COMPLETED
SOLD_OUT events past their date → COMPLETED
Job logs number of events updated
Job handles errors gracefully
Job can be disabled via configuration
Job Behavior:
Runs every hour (configurable)
Finds events where:
status IN (PUBLISHED, SOLD_OUT)
eventDateTime < current time
Updates status to COMPLETED
Logs: "Updated X events to COMPLETED status"
Technical Considerations:
Use @Scheduled annotation
Enable with @EnableScheduling
Make schedule configurable via application.properties
Use @Transactional for batch update
Consider batch size for large updates
Add error handling and retry logic
Configuration Properties:
tickethub.jobs.event-status.enabled=true
tickethub.jobs.event-status.cron=0 0 * * * * (every hour)
Testing Requirements:
Unit test job logic
Test with various event states
Test edge cases (event ending exactly now)
Test configuration disable
Definition of Done:
Scheduled job created
Status transitions correct
Logging implemented
Configuration externalized
Tests passing
Code reviewed and merged

PHASE 3: BOOKING SYSTEM
Duration: Week 3 Goal: Implement ticket booking with proper concurrency control using database-level locking Dependencies: Phase 2 (Events) must be complete Deliverables: Booking creation with race condition prevention, user booking management

EPIC: BOOKING MANAGEMENT
TH-301: Create Booking Entity
Type: Feature Priority: Critical Estimate: 3 hours Assignee: Developer Labels: backend, database, entity Blocked By: TH-205
Summary: Create the Booking entity that represents a user's ticket purchase for an event. This is a critical entity linking users to events.
Business Context: A booking represents a customer's purchase of one or more tickets to an event. We track the booking lifecycle from creation through confirmation (payment) to potential cancellation. The booking reference is what customers use to identify their purchase.
Acceptance Criteria:
Booking entity with all required fields
ManyToOne relationship to User (who made the booking)
ManyToOne relationship to Event (which event)
BookingStatus enum with all states
Unique booking reference auto-generated
Total price calculated from event price × quantity
Proper constraints and indexes
Required Fields:
id (Long, auto-generated primary key)
bookingReference (String, unique, auto-generated, format: "TH-XXXXXXXXXX")
quantity (Integer, required, minimum 1)
unitPrice (BigDecimal, price per ticket at time of booking)
totalPrice (BigDecimal, calculated: unitPrice × quantity)
status (BookingStatus enum, required)
paymentIntentId (String, optional, from Stripe)
expiresAt (LocalDateTime, for pending bookings)
confirmedAt (LocalDateTime, when payment confirmed)
cancelledAt (LocalDateTime, when cancelled)
cancellationReason (String, optional)
user (User entity, required, ManyToOne)
event (Event entity, required, ManyToOne)
createdAt (LocalDateTime, auto-generated)
updatedAt (LocalDateTime, auto-updated)
BookingStatus Enum Values:
PENDING (created, awaiting payment)
CONFIRMED (payment successful)
CANCELLED (user or admin cancelled)
EXPIRED (payment timeout)
REFUNDED (payment refunded)
Booking Reference Format:
Format: "TH-" + 10 alphanumeric characters
Example: "TH-AB3F7K9X2M"
Must be unique across all bookings
Used by customers to identify booking
Relationship Details:
Booking → User (ManyToOne):
Many bookings can belong to one user
Booking must have a user
Fetch type: LAZY
Booking → Event (ManyToOne):
Many bookings can be for one event
Booking must have an event
Fetch type: LAZY
Technical Considerations:
Store unitPrice at booking time (price may change later)
Generate booking reference using UUID or SecureRandom
Index on bookingReference for quick lookups
Index on (user_id, status) for my bookings query
Index on (event_id, status) for event bookings query
Index on (status, expiresAt) for expiration job
Consider adding version field for optimistic locking
Testing Requirements:
Entity saves with all relationships
Booking reference is unique
Total price calculates correctly
Indexes created in database
Definition of Done:
Entity class created
Enum created
Relationships configured
Reference generation working
Tests passing
Code reviewed and merged

TH-302: Booking DTOs & Mapper
Type: Feature Priority: High Estimate: 2 hours Assignee: Developer Labels: backend, dto, validation Blocked By: TH-301
Summary: Create Data Transfer Objects for booking operations. Booking DTOs need to include relevant event and user information for display.
Business Context: When showing a booking, customers need to see event details (name, date, venue) without making additional API calls. DTOs should include nested summaries of related data.
Acceptance Criteria:
CreateBookingRequest DTO with validation
BookingResponse DTO with nested event/venue info
BookingSummaryResponse for list views
BookingMapper for conversions
Proper validation messages
DTO Specifications:
CreateBookingRequest:
eventId (required, must exist)
quantity (required, minimum 1, maximum 10)
BookingResponse (full details):
id
bookingReference
quantity
unitPrice
totalPrice
status
expiresAt (if PENDING)
confirmedAt (if CONFIRMED)
cancelledAt (if CANCELLED)
cancellationReason (if CANCELLED)
event (EventSummaryForBooking - nested)
createdAt
EventSummaryForBooking (nested in booking):
id
name
artistName
eventDateTime
venueName
venueCity
venueAddress
imageUrl
BookingSummaryResponse (for lists):
id
bookingReference
eventName
eventDateTime
venueName
quantity
totalPrice
status
createdAt
CancelBookingRequest:
reason (optional, max 500 chars)
Technical Considerations:
Include enough event info to display booking without fetching event
Don't include payment details in response (security)
Format prices for display (two decimal places)
Format dates in ISO-8601
Testing Requirements:
Mapper handles all fields correctly
Nested objects mapped properly
Null handling for optional fields
Definition of Done:
All DTOs created
Validations applied
Mapper implemented
Tests passing
Code reviewed and merged

TH-303: Booking Service with Database Locking
Type: Feature Priority: Critical Estimate: 6 hours Assignee: Developer Labels: backend, service, concurrency, critical-path Blocked By: TH-301, TH-302
Summary: Implement booking creation with pessimistic database locking to prevent race conditions. This is the CORE technical challenge of the project — preventing double-booking when multiple users try to book simultaneously.
Business Context: Imagine 100 users trying to book the last 5 tickets at the exact same moment. Without proper locking, all 100 might see "5 tickets available," proceed to book, and we'd oversell by 95 tickets. This is a distributed systems problem that requires careful handling.
The Problem (Race Condition):
User A reads availableTickets = 5
User B reads availableTickets = 5
User A books 3 tickets, updates to 2
User B books 3 tickets, updates to 2
Result: 6 tickets sold but only 5 existed!
The Solution (Pessimistic Locking):
User A locks the event row (SELECT FOR UPDATE)
User B tries to read, but WAITS for lock
User A books 3 tickets, updates to 2, releases lock
User B acquires lock, reads availableTickets = 2
User B can only book 2 tickets
Result: Exactly 5 tickets sold!
Acceptance Criteria:
createBooking() uses database pessimistic lock
Race conditions prevented (provable via concurrent test)
Tickets correctly decremented atomically
InsufficientTicketsException when not enough tickets
Booking created with PENDING status
Expiration time set (10 minutes from creation)
Transaction rollback on any error
Full unit and integration test coverage
Required Methods:
createBooking(CreateBookingRequest request) → BookingResponse
Flow:
Get current user from SecurityContext
START TRANSACTION
Find event by ID WITH PESSIMISTIC LOCK
Validate event is PUBLISHED
Validate eventDateTime is in future
Validate availableTickets >= requested quantity
Decrement availableTickets
If availableTickets becomes 0, update event status to SOLD_OUT
Create booking with PENDING status
Set expiresAt to now + 10 minutes
Generate unique booking reference
Save booking
COMMIT TRANSACTION
Return response
Errors:
EventNotFoundException: event doesn't exist
EventNotAvailableException: not published or in past
InsufficientTicketsException: not enough tickets
getBookingById(Long id) → BookingResponse
User can only view their own bookings
Admin can view any booking
Throws ResourceNotFoundException if not found
Throws AccessDeniedException if not owner (and not admin)
getBookingByReference(String reference) → BookingResponse
Find by booking reference
Same authorization rules as above
getMyBookings(Pageable pageable) → Page<BookingSummaryResponse>
Returns bookings for current user
Ordered by createdAt descending (newest first)
All statuses included
cancelBooking(Long id, CancelBookingRequest request) → BookingResponse
Flow:
Find booking
Validate ownership (or admin)
Validate status is PENDING or CONFIRMED
Validate event hasn't happened yet
START TRANSACTION WITH LOCK on event
Update booking status to CANCELLED
Set cancelledAt and cancellationReason
Restore availableTickets to event
If event was SOLD_OUT, update status to PUBLISHED
COMMIT
Return response
Business Rule: Can only cancel up to 24 hours before event
getEventBookings(Long eventId, Pageable pageable) → Page<BookingSummaryResponse>
Admin only
Returns all bookings for an event
For admin dashboard
Technical Considerations:
Use @Lock(LockModeType.PESSIMISTIC_WRITE) on repository method
Use @Transactional with appropriate isolation level
Lock wait timeout configuration
Deadlock prevention (always lock in same order)
Consider optimistic locking as fallback
Detailed logging for debugging concurrency issues
Custom Repository Method:
@Lock(LockModeType.PESSIMISTIC_WRITE)
@Query("SELECT e FROM Event e WHERE e.id = :id")
Optional<Event> findByIdWithLock(@Param("id") Long id);
Exception Classes:
InsufficientTicketsException (409 Conflict)
EventNotAvailableException (400 Bad Request)
BookingCancellationException (409 Conflict)
Testing Requirements:
Unit tests with mocks
Integration test with real database
CRITICAL: Concurrent booking test with multiple threads
Test that proves no overselling occurs
Test booking with exactly available tickets
Test booking with more than available tickets
Concurrent Test Approach:
Create event with 10 tickets
Spawn 20 threads, each trying to book 1 ticket
Assert: exactly 10 bookings succeed
Assert: exactly 10 bookings fail with InsufficientTicketsException
Assert: availableTickets = 0 after test
Definition of Done:
Locking mechanism implemented
All methods working correctly
Concurrent test proves no race conditions
Exception handling complete
Unit tests passing
Integration tests passing
Code reviewed and merged

TH-304: Booking REST Controller
Type: Feature Priority: High Estimate: 3 hours Assignee: Developer Labels: backend, api, controller Blocked By: TH-303
Summary: Create REST API endpoints for booking operations. Users can create bookings and view their own bookings. Admins have additional access.
Business Context: These endpoints enable the core user journey — booking tickets for events. Security is critical: users should only see their own bookings.
Acceptance Criteria:
All endpoints follow REST conventions
Users can only access their own bookings
Admins can access all bookings
Proper error responses
All endpoints tested
API Endpoints:
POST /api/bookings
Creates a new booking
Requires: Authenticated user
Request Body: CreateBookingRequest
Success: 201 Created with BookingResponse
Errors:
400: Invalid request
404: Event not found
409: Insufficient tickets or event not available
GET /api/bookings
Lists current user's bookings
Requires: Authenticated user
Query Params: page, size, status (optional filter)
Success: 200 OK with Page<BookingSummaryResponse>
GET /api/bookings/{id}
Gets booking details
Requires: Authenticated user (owner or admin)
Success: 200 OK with BookingResponse
Errors: 404 Not Found, 403 Forbidden
GET /api/bookings/reference/{reference}
Gets booking by reference code
Requires: Authenticated user (owner or admin)
Success: 200 OK with BookingResponse
Errors: 404 Not Found, 403 Forbidden
PATCH /api/bookings/{id}/cancel
Cancels a booking
Requires: Authenticated user (owner or admin)
Request Body: CancelBookingRequest (optional)
Success: 200 OK with BookingResponse
Errors: 404 Not Found, 403 Forbidden, 409 Conflict
GET /api/admin/bookings
Lists all bookings
Requires: ADMIN role
Query Params: page, size, status, eventId
Success: 200 OK with Page<BookingSummaryResponse>
GET /api/admin/events/{eventId}/bookings
Lists bookings for specific event
Requires: ADMIN role
Success: 200 OK with Page<BookingSummaryResponse>
Technical Considerations:
Use @AuthenticationPrincipal to get current user
Check booking ownership in controller or service
Return 403 Forbidden for unauthorized access
Return 404 Not Found even for unauthorized (security)
Add rate limiting consideration (future)
Testing Requirements:
Test all endpoints with Postman
Test authorization (user vs admin vs wrong user)
Test error scenarios
Update Postman collection
Definition of Done:
All endpoints implemented
Authorization enforced
Error handling complete
Postman collection updated
Code reviewed and merged

TH-305: Booking Cancellation Logic
Type: Feature Priority: High Estimate: 3 hours Assignee: Developer Labels: backend, service, business-logic Blocked By: TH-303
Summary: Implement comprehensive booking cancellation with ticket restoration and business rules.
Business Context: When a user cancels a booking, tickets must be returned to the available pool so other users can book them. Business rules prevent last-minute cancellations and cancellation of past events.
Acceptance Criteria:
Cancelled bookings restore tickets to event
Uses same locking mechanism as booking creation
Business rules enforced
Cancellation reason stored
Event status updated if was SOLD_OUT
Audit trail maintained
Business Rules:
Can only cancel PENDING or CONFIRMED bookings
Cannot cancel if event has already happened
Cannot cancel within 24 hours of event (configurable)
Admin can override 24-hour rule
Cancelled bookings cannot be un-cancelled
Cancellation Flow:
Validate booking exists
Validate ownership (or admin)
Validate current status allows cancellation
Validate timing rules
TRANSACTION WITH LOCK on event:
Update booking status to CANCELLED
Set cancelledAt = now
Set cancellationReason
Add quantity back to availableTickets
If event was SOLD_OUT and now has tickets, set to PUBLISHED
Return updated booking
Configuration:
tickethub.booking.cancellation-cutoff-hours=24
Technical Considerations:
Use same pessimistic locking as creation
Handle edge case: event deleted after booking
Log all cancellations for audit
Consider soft-delete pattern
Future Integration (Phase 4):
Trigger refund via payment service
Send cancellation confirmation email
Testing Requirements:
Test successful cancellation
Test ticket restoration
Test SOLD_OUT → PUBLISHED transition
Test business rule enforcement
Test concurrent cancellation scenario
Definition of Done:
Cancellation logic implemented
Business rules enforced
Ticket restoration working
Status transitions correct
Tests passing
Code reviewed and merged

TH-306: Booking Expiration Scheduled Job
Type: Feature Priority: High Estimate: 3 hours Assignee: Developer Labels: backend, scheduled-job Blocked By: TH-303
Summary: Create scheduled job to automatically expire PENDING bookings that haven't been paid within the timeout period, restoring tickets to availability.
Business Context: When a user starts a booking but doesn't complete payment, those tickets are held hostage. We need to automatically release them after a timeout so other users can book them. This prevents inventory lockup.
Acceptance Criteria:
Job runs on configurable schedule (every 1 minute)
Finds PENDING bookings past expiresAt
Changes status to EXPIRED
Restores tickets to event
Logs actions taken
Handles errors gracefully
Can be disabled via configuration
Job Behavior:
Query: SELECT bookings WHERE status = PENDING AND expiresAt < NOW()
For each expired booking:
TRANSACTION WITH LOCK on event
Update booking status to EXPIRED
Add quantity back to availableTickets
If event was SOLD_OUT, update to PUBLISHED
Log summary: "Expired X bookings, restored Y tickets"
Configuration:
tickethub.jobs.booking-expiration.enabled=true
tickethub.jobs.booking-expiration.cron=0 * * * * * (every minute)
tickethub.booking.pending-timeout-minutes=10
Technical Considerations:
Use @Scheduled annotation
Process in batches to avoid long transactions
Handle individual booking failures without stopping whole job
Consider distributed locking if multiple app instances (ShedLock)
Metrics: track expired bookings count
Edge Cases:
Booking expires during payment processing
Event deleted while booking pending
Multiple instances running same job
Testing Requirements:
Test booking expiration
Test ticket restoration
Test with multiple expired bookings
Test error handling (one fails, others continue)
Test configuration disable
Definition of Done:
Scheduled job created
Expiration logic correct
Ticket restoration working
Logging implemented
Configuration externalized
Tests passing
Code reviewed and merged

TH-307: Booking Confirmation Endpoint (Pre-Payment)
Type: Feature Priority: Medium Estimate: 2 hours Assignee: Developer Labels: backend, api Blocked By: TH-303
Summary: Create an endpoint to confirm a PENDING booking (for testing before payment integration). This will later be called by the payment webhook.
Business Context: Before we integrate Stripe, we need a way to confirm bookings for testing. This endpoint simulates successful payment. In Phase 4, this logic moves to the payment webhook handler.
Acceptance Criteria:
Endpoint confirms PENDING booking
Updates status to CONFIRMED
Sets confirmedAt timestamp
Returns updated booking
Only works for PENDING status
API Endpoint:
PATCH /api/admin/bookings/{id}/confirm
Confirms a booking (admin/testing only)
Requires: ADMIN role
Success: 200 OK with BookingResponse
Errors: 404 Not Found, 409 Conflict (not PENDING)
Technical Considerations:
This is a temporary testing endpoint
Will be replaced by payment webhook in Phase 4
Consider marking as @Deprecated or behind feature flag
Useful for demo and testing
Testing Requirements:
Test successful confirmation
Test non-PENDING booking (should fail)
Test non-existent booking
Definition of Done:
Endpoint implemented
Status transition correct
Tests passing
Documented as testing endpoint
Code reviewed and merged

PHASE 4: DOCKER, REDIS & PAYMENTS
Duration: Week 4 Goal: Containerize application, add Redis distributed locking, integrate Stripe payments, add email notifications Dependencies: Phase 3 (Booking) must be complete Deliverables: Dockerized app, Redis locking, Stripe integration, email service

EPIC: CONTAINERIZATION
TH-401: Create Dockerfile
Type: DevOps Priority: High Estimate: 2 hours Assignee: Developer Labels: devops, docker
Summary: Create an optimized multi-stage Dockerfile for the application. Multi-stage builds result in smaller, more secure production images.
Business Context: Docker containers are the standard for deploying applications. A well-crafted Dockerfile ensures consistent builds, small image sizes, and security best practices.
Acceptance Criteria:
Multi-stage Dockerfile created
Build stage compiles application
Runtime stage is minimal (JRE only)
Application runs as non-root user
Health check endpoint configured
Image size under 300MB
.dockerignore file created
Can build and run locally
Dockerfile Structure:
Stage 1: Build
Base image: maven:3.9-eclipse-temurin-17
Copy pom.xml first (dependency caching)
Download dependencies
Copy source code
Build JAR file
Skip tests in Docker build (run separately in CI)
Stage 2: Runtime
Base image: eclipse-temurin:17-jre-alpine
Create non-root user (appuser)
Copy JAR from build stage
Expose port 8080
Set JVM options for containers
Health check command
Entrypoint to run application
.dockerignore Contents:
target/
.git/
.idea/
*.md
.env
docker-compose*.yml
Technical Considerations:
Use specific version tags, not 'latest'
Alpine-based images for smaller size
Layer ordering for cache efficiency
JVM container-aware settings (-XX:+UseContainerSupport)
Consider memory limits (-XX:MaxRAMPercentage=75.0)
No secrets in image
Testing Requirements:
Image builds successfully
Container starts and responds to health check
Application logs are visible
Container stops gracefully
Definition of Done:
Dockerfile created
.dockerignore created
Image builds successfully
Container runs locally
Image size acceptable
Documentation updated
Code reviewed and merged

TH-402: Docker Compose for Local Development
Type: DevOps Priority: High Estimate: 3 hours Assignee: Developer Labels: devops, docker Blocked By: TH-401
Summary: Create Docker Compose configuration for local development environment with all required services (app, PostgreSQL, Redis).
Business Context: Docker Compose allows developers to spin up the entire application stack with a single command. This ensures everyone develops against the same environment configuration.
Acceptance Criteria:
docker-compose.yml with all services
PostgreSQL service with persistent volume
Redis service with persistent volume
Application service connects to both
Environment variables externalized
Health checks for all services
Single command startup: docker-compose up
Hot reload support for development (optional)
Services Configuration:
postgres:
Image: postgres:15-alpine
Port: 5432:5432
Volume: postgres_data:/var/lib/postgresql/data
Environment: POSTGRES_DB, POSTGRES_USER, POSTGRES_PASSWORD
Health check: pg_isready
redis:
Image: redis:7-alpine
Port: 6379:6379
Volume: redis_data:/data
Health check: redis-cli ping
app:
Build from Dockerfile
Ports: 8080:8080
Depends on: postgres, redis
Environment variables for database and Redis connection
Wait for dependencies to be healthy
Environment Variables (.env file):
POSTGRES_DB=tickethub
POSTGRES_USER=tickethub
POSTGRES_PASSWORD=<secure_password>
SPRING_PROFILES_ACTIVE=docker
DATABASE_URL=jdbc:postgresql://postgres:5432/tickethub
REDIS_HOST=redis
REDIS_PORT=6379
JWT_SECRET=<secure_secret>
Technical Considerations:
Use Docker networks for service communication
Named volumes for data persistence
.env file for secrets (git-ignored)
docker-compose.override.yml for local customization
Consider adding pgAdmin for database management
Consider adding Redis Commander for Redis management
Optional Services:
pgAdmin: Database GUI (port 5050)
Redis Commander: Redis GUI (port 8081)
Testing Requirements:
All services start successfully
Application connects to PostgreSQL
Application connects to Redis
Data persists across restarts
Logs accessible via docker-compose logs
Definition of Done:
docker-compose.yml created
All services configured
Environment variables externalized
Volumes for persistence
Health checks working
Documentation for usage
Code reviewed and merged

EPIC: REDIS INTEGRATION
TH-403: Redis Dependencies & Configuration
Type: Feature Priority: High Estimate: 2 hours Assignee: Developer Labels: backend, redis, configuration Blocked By: TH-402
Summary: Add Redis dependencies and configure connection using Redisson library. Redisson provides distributed locking capabilities that Jedis/Lettuce don't have.
Business Context: Redis serves two purposes: distributed locking for booking concurrency and caching for performance. Redisson is preferred because it provides battle-tested distributed lock implementations.
Acceptance Criteria:
Redisson dependency added to pom.xml
RedissonClient bean configured
Connection works in Docker environment
Connection works with standalone Redis
Health check includes Redis status
Graceful handling when Redis unavailable
Configuration externalized
Dependencies to Add:
org.redisson:redisson-spring-boot-starter:3.25.0
Configuration Class:
Create RedisConfig with @Configuration
Create RedissonClient bean
Configure connection based on profile
Support single server and cluster modes
Configuration Properties:
tickethub.redis.host=localhost
tickethub.redis.port=6379
tickethub.redis.password= (optional)
tickethub.redis.database=0
tickethub.redis.timeout=3000
tickethub.redis.connection-pool-size=10
Health Check:
Add Redis health indicator to Actuator
Endpoint: /actuator/health shows Redis status
Technical Considerations:
Redisson handles connection pooling
Configure timeout and retry settings
Support for Redis Sentinel (future)
Support for Redis Cluster (future)
Graceful degradation if Redis unavailable
Testing Requirements:
Connection established on startup
Health check shows Redis status
Application handles Redis connection failure gracefully
Configuration overridable via environment
Definition of Done:
Dependency added
Configuration class created
Connection works in Docker
Health check working
Error handling for unavailable Redis
Tests passing
Code reviewed and merged

TH-404: Distributed Lock Service
Type: Feature Priority: Critical Estimate: 4 hours Assignee: Developer Labels: backend, redis, concurrency, critical-path Blocked By: TH-403
Summary: Create a service for distributed locking using Redis. This is a critical component that coordinates booking operations across multiple application instances.
Business Context: When running multiple application servers (for scalability), database locking alone isn't sufficient. Two app servers might simultaneously try to book, each starting their own database transaction. Redis distributed lock ensures only one server can process a booking for a specific event at a time.
The Problem (Multi-Instance Race):
Server A receives booking request for Event 1
Server B receives booking request for Event 1 (same millisecond)
Both start transactions and acquire DB locks (different connections)
Still potential for race conditions at application level
The Solution (Redis Distributed Lock):
Server A tries to acquire Redis lock "event:1:booking"
Server B tries to acquire same lock
Server A gets the lock, Server B waits
Server A completes booking, releases lock
Server B acquires lock, proceeds with potentially updated ticket count
Acceptance Criteria:
DistributedLockService interface defined
RedisDistributedLockService implementation using Redisson
Lock has configurable TTL (default 30 seconds)
Lock has configurable wait time (default 10 seconds)
Automatic lock release on method completion
Graceful fallback if Redis unavailable
Metrics for lock acquisition time
Full test coverage
Interface Definition:
DistributedLockService:
tryLock(String key, long waitTime, long leaseTime, TimeUnit unit) → boolean
unlock(String key) → void
isLocked(String key) → boolean
executeWithLock(String key, Supplier<T> action) → T (convenience method)
Lock Key Convention:
Format: "lock:{resource}:{id}"
Booking lock: "lock:booking:event:{eventId}"
Examples:
"lock:booking:event:123"
"lock:payment:booking:456"
Lock Parameters:
waitTime: How long to wait to acquire lock (default 10s)
leaseTime: How long to hold lock before auto-release (default 30s)
These prevent deadlocks if a server crashes while holding lock
Fallback Behavior:
If Redis unavailable, log warning and allow operation
Fallback to database-only locking (less safe but operational)
Alert/metric for Redis failures
Technical Considerations:
Use Redisson RLock for distributed locking
RLock handles Redis crashes and network partitions
Always release lock in finally block
Use try-with-resources pattern if possible
Add metrics: lock.acquire.time, lock.acquire.success, lock.acquire.timeout
Consider lock contention metrics
Error Scenarios:
Lock acquisition timeout: Return false, let caller handle
Redis connection failure: Log, allow with warning
Lock holder crashes: TTL ensures eventual release
Deadlock: Not possible with TTL
Testing Requirements:
Unit tests with mock Redis
Integration test with real Redis (Testcontainers)
Test lock acquisition and release
Test lock timeout behavior
Test concurrent lock attempts
Test Redis failure fallback
Definition of Done:
Interface defined
Implementation complete
TTL and wait time configurable
Fallback behavior implemented
Metrics added
Unit tests passing
Integration tests passing
Code reviewed and merged

TH-405: Integrate Redis Lock into Booking Flow
Type: Feature Priority: Critical Estimate: 4 hours Assignee: Developer Labels: backend, booking, concurrency, critical-path Blocked By: TH-303, TH-404
Summary: Update the booking service to use Redis distributed lock BEFORE database pessimistic lock. This creates a double-locking strategy that prevents race conditions across multiple application instances.
Business Context: This is the "wow factor" of the project — demonstrating a production-grade concurrency solution. You'll be able to explain in interviews how you implemented double-locking to handle distributed concurrency.
The Double-Lock Strategy:
Redis Lock (application level, distributed)
Coordinates across multiple app servers
Fast (milliseconds)
Eventually consistent
Database Lock (data level, ACID)
Ensures transactional integrity
Last line of defense
Strongly consistent
Updated Booking Flow:
Receive booking request
TRY ACQUIRE REDIS LOCK ("lock:booking:event:{eventId}")
Wait up to 10 seconds
If timeout: return 409 Conflict "Too many concurrent requests"
START DATABASE TRANSACTION
Acquire database lock (SELECT FOR UPDATE)
Validate and decrement tickets
Create booking
COMMIT TRANSACTION
RELEASE REDIS LOCK (in finally block)
Return response
Acceptance Criteria:
Booking service uses Redis lock before DB operations
Lock acquired with reasonable timeout
Lock always released (even on exception)
Proper error message when lock acquisition fails
Fallback to DB-only locking if Redis unavailable
Load test with multiple instances proves correctness
Metrics track lock performance
Error Handling:
Lock Acquisition Timeout:
Return: 409 Conflict
Message: "Unable to process booking due to high demand. Please try again."
Log: WARN level with details
Redis Unavailable:
Log: WARN "Redis unavailable, proceeding with database locking only"
Continue with DB lock only
Alert ops team (future: integrate with monitoring)
Booking Failure After Lock Acquired:
Always release lock in finally
Let exception propagate
Transaction rolled back automatically
Technical Considerations:
Use try-finally to ensure lock release
Lock key based on eventId
Consider using executeWithLock convenience method
Add timing metrics
Log lock acquisition for debugging
Performance Considerations:
Redis lock: ~1-5ms typically
Lock wait time impacts user experience
Monitor lock contention in production
Consider queue-based solution for very high traffic (future)
Testing Requirements:
Unit test with mocked lock service
Integration test with Redis (Testcontainers)
CRITICAL: Multi-instance concurrency test
Spin up 2+ app instances with Docker Compose
Concurrent booking attempts from multiple threads
Verify no overselling across instances
Test Redis failure fallback
Performance test lock acquisition time
Multi-Instance Test Approach:
Docker Compose with 2 app instances, 1 PostgreSQL, 1 Redis
Create event with 10 tickets
Use load testing tool (or custom script) to send 50 concurrent booking requests
Distribute requests across both app instances
Verify: exactly 10 bookings succeed, 40 fail
Verify: availableTickets = 0
Definition of Done:
Redis lock integrated into booking flow
Error handling complete
Fallback behavior working
Single-instance tests passing
Multi-instance test passing
Metrics implemented
Performance acceptable
Code reviewed and merged

TH-406: Event Caching with Redis
Type: Feature Priority: Medium Estimate: 3 hours Assignee: Developer Labels: backend, redis, caching, performance Blocked By: TH-403
Summary: Implement caching for frequently accessed event data using Redis. This reduces database load and improves response times.
Business Context: Event listings and details are read much more often than they're updated. Caching these responses dramatically improves performance and reduces database load, especially for popular events.
Acceptance Criteria:
Event details cached with configurable TTL
Event list cached with shorter TTL
Cache invalidated on event update/delete
Cache-aside pattern implemented
Cache hit/miss logged
Graceful handling when Redis unavailable
Cache can be cleared manually (admin)
Caching Strategy:
What to Cache:
Event details (single event): TTL 5 minutes
Event listings (search results): TTL 2 minutes
Venue details: TTL 10 minutes
What NOT to Cache:
availableTickets (changes frequently)
User-specific data (bookings)
Anything after write operations
Cache Keys:
Event: "cache:event:{id}"
Event list: "cache:events:page:{page}:size:{size}:category:{category}"
Venue: "cache:venue:{id}"
Cache-Aside Pattern:
Check cache first
If hit: return cached data
If miss: query database
Store in cache with TTL
Return data
Cache Invalidation:
On event update: delete "cache:event:{id}" and all list caches
On event delete: same as update
On event publish/cancel: same as update
Consider using cache tags for smarter invalidation
Technical Considerations:
Use Spring Cache abstraction (@Cacheable, @CacheEvict)
Configure RedisCacheManager with custom TTLs
Serialize as JSON for readability
Handle cache stampede (optional: probabilistic early expiration)
Monitor cache hit ratio
Configuration:
tickethub.cache.event.ttl-minutes=5
tickethub.cache.event-list.ttl-minutes=2
tickethub.cache.venue.ttl-minutes=10
tickethub.cache.enabled=true
Testing Requirements:
Test cache hit scenario
Test cache miss scenario
Test cache invalidation on update
Test Redis unavailable (fallback to DB)
Performance comparison (cached vs uncached)
Definition of Done:
Caching implemented with Spring Cache
TTLs configurable
Cache invalidation working
Fallback to DB on cache failure
Metrics/logging for hit ratio
Tests passing
Code reviewed and merged

EPIC: PAYMENT INTEGRATION
TH-407: Stripe Account & SDK Configuration
Type: Setup Priority: High Estimate: 1 hour Assignee: Developer Labels: setup, payments, stripe
Summary: Set up Stripe test account and configure the Stripe SDK in the application. This is the foundation for payment processing.
Business Context: Stripe is the industry standard for online payments. We use their Payment Intents API for a robust, SCA-compliant payment flow. Test mode allows full integration testing without real money.
Acceptance Criteria:
Stripe test account created
API keys obtained (publishable + secret)
Stripe Java SDK dependency added
API key configured via environment variable
Test API connection works
Webhook signing secret obtained
Setup Steps:
Create Stripe account at stripe.com
Access test mode dashboard
Get test API keys:
Publishable key: pk_test_...
Secret key: sk_test_...
Set up webhook endpoint (for local testing: use Stripe CLI)
Get webhook signing secret: whsec_...
Dependencies to Add:
com.stripe:stripe-java:24.0.0
Configuration:
STRIPE_SECRET_KEY (environment variable)
STRIPE_PUBLISHABLE_KEY (for frontend, can be in config)
STRIPE_WEBHOOK_SECRET (environment variable)
Configuration Class:
StripeConfig with @Configuration
Initialize Stripe API key on startup
Validate key is present
Technical Considerations:
Never commit real keys to repository
Use environment variables for all keys
Different keys for dev/staging/prod
Enable Stripe CLI for local webhook testing
Stripe CLI Setup (Local Testing):
Install Stripe CLI
Login: stripe login
Forward webhooks: stripe listen --forward-to localhost:8080/api/webhooks/stripe
This provides a temporary webhook signing secret for local testing
Testing Requirements:
SDK initializes without error
Test API call succeeds (list products or similar)
Keys loaded from environment
Definition of Done:
Stripe account created
SDK dependency added
Configuration class created
Environment variables documented
Test connection works
Code reviewed and merged

TH-408: Payment Entity & Service
Type: Feature Priority: High Estimate: 4 hours Assignee: Developer Labels: backend, payments, stripe Blocked By: TH-407
Summary: Create Payment entity to track payment status and implement PaymentService for Stripe integration.
Business Context: We need to track payment attempts and their outcomes. A payment is linked to a booking. Stripe's Payment Intent provides a robust flow that handles complex scenarios like 3D Secure authentication.
Acceptance Criteria:
Payment entity created
PaymentStatus enum with all states
PaymentService creates Payment Intents
Client secret returned for frontend
Payment record created with PENDING status
Unit tests with Stripe mocks
Payment Entity Fields:
id (Long, primary key)
paymentIntentId (String, unique, from Stripe)
bookingId (Long, foreign key to Booking)
amount (Long, in cents)
currency (String, default "usd")
status (PaymentStatus enum)
failureReason (String, optional)
stripeCustomerId (String, optional)
createdAt (LocalDateTime)
updatedAt (LocalDateTime)
PaymentStatus Enum:
PENDING (payment intent created)
PROCESSING (payment in progress)
SUCCEEDED (payment completed)
FAILED (payment declined)
CANCELLED (payment cancelled)
REFUNDED (payment refunded)
PaymentService Methods:
createPaymentIntent(Long bookingId) → PaymentIntentResponse
Get booking details
Validate booking is PENDING
Create Stripe Payment Intent:
Amount in cents
Currency: USD
Metadata: bookingId, bookingReference
Create Payment entity with PENDING status
Update booking with paymentIntentId
Return: clientSecret, paymentIntentId, amount
PaymentIntentResponse DTO:
clientSecret (for frontend to complete payment)
paymentIntentId
amount
currency
Technical Considerations:
Stripe amounts are in cents (multiply by 100)
Store paymentIntentId for reference
Add metadata for reconciliation
Handle Stripe API errors gracefully
Consider idempotency key for retries
Testing Requirements:
Test Payment Intent creation
Test booking validation
Test error handling
Mock Stripe API in tests
Definition of Done:
Payment entity created
PaymentService implemented
Payment Intent creation working
Error handling complete
Tests passing
Code reviewed and merged

TH-409: Stripe Webhook Handler
Type: Feature Priority: High Estimate: 4 hours Assignee: Developer Labels: backend, payments, webhook Blocked By: TH-408
Summary: Implement webhook endpoint to handle asynchronous payment events from Stripe. Webhooks confirm payment success or failure.
Business Context: Stripe sends webhooks for payment events. We must handle these to confirm bookings when payment succeeds or release tickets when payment fails. This is an asynchronous, event-driven flow.
Webhook Flow:
User completes payment on frontend
Stripe processes payment
Stripe sends webhook to our server
We update booking status based on event
Acceptance Criteria:
Webhook endpoint created at /api/webhooks/stripe
Signature verification implemented
Handle payment_intent.succeeded event
Handle payment_intent.payment_failed event
Booking status updated correctly
Handler is idempotent (safe to receive same event twice)
Returns 200 quickly (processing is async)
Webhook Events to Handle:
payment_intent.succeeded:
Find booking by paymentIntentId (from metadata)
Update Payment status to SUCCEEDED
Update Booking status to CONFIRMED
Set confirmedAt timestamp
Trigger confirmation email (async)
payment_intent.payment_failed:
Find booking by paymentIntentId
Update Payment status to FAILED
Store failure reason
Booking stays PENDING (user can retry)
If retry limit exceeded: TRANSACTION WITH LOCK
Update booking to CANCELLED
Restore tickets to event
Webhook Endpoint:
POST /api/webhooks/stripe
No authentication (Stripe signs requests)
Request Body: raw JSON (don't parse before verification)
Header: Stripe-Signature for verification
Response: 200 OK (or Stripe will retry)
Signature Verification:
Get raw request body
Get Stripe-Signature header
Use Webhook.constructEvent() with signing secret
If invalid: return 400 Bad Request
Idempotency:
Store processed event IDs
Check if event already processed
Skip duplicate events
Use payment_intent.id as idempotency key
Technical Considerations:
Return 200 quickly, process async if needed
Use @Async for email sending
Log all webhook events for debugging
Handle unknown event types gracefully
Consider webhook event replay for missed events
Error Handling:
Invalid signature: 400 Bad Request
Unknown event type: 200 OK (ignore)
Processing error: 500 (Stripe will retry)
Already processed: 200 OK (skip)
Testing Requirements:
Test with Stripe CLI: stripe trigger payment_intent.succeeded
Test signature verification
Test booking confirmation
Test payment failure handling
Test idempotency (same event twice)
Test with real test cards
Stripe Test Cards:
Success: 4242 4242 4242 4242
Decline: 4000 0000 0000 0002
3D Secure: 4000 0025 0000 3155
Insufficient funds: 4000 0000 0000 9995
Definition of Done:
Webhook endpoint created
Signature verification working
All event types handled
Idempotency implemented
Booking updates correct
Tests with Stripe CLI passing
Code reviewed and merged

TH-410: Payment Controller & Updated Booking Flow
Type: Feature Priority: High Estimate: 3 hours Assignee: Developer Labels: backend, api, payments Blocked By: TH-408, TH-409
Summary: Create payment endpoint and update booking flow to integrate with payments. The booking creation now returns payment information for the frontend.
Business Context: The complete booking flow: create booking → create payment intent → frontend collects payment → webhook confirms → booking confirmed. The API guides this flow.
Updated Booking Flow:
User selects tickets and submits booking
Backend creates PENDING booking (tickets held)
Backend creates Stripe Payment Intent
Backend returns booking + clientSecret
Frontend uses clientSecret with Stripe.js
User enters card details
Stripe processes payment
Webhook confirms booking
User sees confirmation
Acceptance Criteria:
Create booking returns payment info
Payment endpoint for explicit payment creation
Get payment status endpoint
Booking response includes payment status
Full flow tested end-to-end
API Endpoints:
POST /api/bookings (updated)
Now also creates Payment Intent
Returns: BookingWithPaymentResponse
booking details
clientSecret (for Stripe.js)
paymentIntentId
POST /api/bookings/{id}/payment (alternative)
Creates payment for existing booking
For retrying failed payments
Returns: PaymentIntentResponse
GET /api/bookings/{id}/payment
Gets payment status for booking
Returns: PaymentResponse
BookingWithPaymentResponse:
id
bookingReference
quantity
totalPrice
status
event (summary)
payment:
clientSecret
paymentIntentId
amount
currency
Technical Considerations:
Transaction: booking + payment intent atomic
Handle Stripe errors gracefully
Return user-friendly error messages
Consider timeout for payment completion
Testing Requirements:
Full flow test with Stripe test mode
Test retry payment scenario
Test payment status endpoint
Postman collection updated
Definition of Done:
Endpoints implemented
Booking flow updated
Full flow tested
Error handling complete
Postman collection updated
Code reviewed and merged

TH-411: Payment Refund Service
Type: Feature Priority: Medium Estimate: 3 hours Assignee: Developer Labels: backend, payments Blocked By: TH-409
Summary: Implement refund capability for cancelled bookings. When a confirmed booking is cancelled, we process a refund via Stripe.
Business Context: Customers expect refunds when they cancel bookings. We need to process refunds through Stripe and track the refund status.
Acceptance Criteria:
Refund processed on booking cancellation
Full refund for cancellations before cutoff
Refund status tracked in Payment entity
Refund webhook handled
Refund confirmation email sent
RefundService Methods:
processRefund(Long bookingId) → RefundResponse
Get booking and payment
Validate booking is CONFIRMED
Create Stripe Refund for Payment Intent
Update Payment status to REFUNDED
Update Booking status to REFUNDED
Return refund details
RefundResponse DTO:
refundId
amount
status
bookingReference
Refund Policies:
Full refund if cancelled before 24-hour cutoff
Future: partial refund within 24 hours
Future: no refund on event day
Webhook Events:
refund.created / refund.succeeded:
Update payment status
Ensure idempotent
Technical Considerations:
Stripe refunds are also async
Handle partial refunds (future)
Track refund ID from Stripe
Consider refund reason for analytics
Testing Requirements:
Test refund creation
Test refund webhook
Test with various cancellation scenarios
Test Stripe test mode refunds
Definition of Done:
Refund service implemented
Integration with cancellation flow
Webhook handling
Tests passing
Code reviewed and merged

EPIC: EMAIL NOTIFICATIONS
TH-412: Email Service Configuration
Type: Setup Priority: Medium Estimate: 2 hours Assignee: Developer Labels: backend, email, setup
Summary: Configure email sending capability using SendGrid (or AWS SES as alternative). Set up templates with Thymeleaf.
Business Context: Transactional emails (confirmations, reminders) are essential for user experience. SendGrid offers a generous free tier and easy integration.
Acceptance Criteria:
SendGrid account created
API key configured
EmailService interface defined
Sender email verified
Test email sends successfully
HTML templates supported
Async sending enabled
SendGrid Setup:
Create SendGrid account
Verify sender email address
Create API key with Mail Send permission
Store API key in environment variable
Dependencies:
com.sendgrid:sendgrid-java:4.10.1
org.springframework.boot:spring-boot-starter-thymeleaf
EmailService Interface:
sendEmail(String to, String subject, String templateName, Map<String, Object> context)
sendWelcomeEmail(User user)
sendBookingConfirmation(Booking booking)
sendBookingCancellation(Booking booking)
sendEventReminder(Booking booking)
sendEventCancellation(Booking booking, Event event)
Template Location:
src/main/resources/templates/email/
welcome.html
booking-confirmation.html
booking-cancellation.html
event-reminder.html
event-cancelled.html
Configuration:
SENDGRID_API_KEY (environment variable)
tickethub.email.from=noreply@tickethub.com
tickethub.email.enabled=true
Technical Considerations:
Use @Async for non-blocking sends
Handle SendGrid API errors
Rate limiting (SendGrid limits)
Consider email queue for high volume (future)
Log email sends for audit
Testing Requirements:
Test email sends in dev
Test with SendGrid sandbox mode
Test template rendering
Test async behavior
Definition of Done:
SendGrid configured
EmailService implemented
Test email works
Templates created
Async sending working
Code reviewed and merged

TH-413: Booking Confirmation Email
Type: Feature Priority: Medium Estimate: 3 hours Assignee: Developer Labels: backend, email Blocked By: TH-412, TH-409
Summary: Send beautiful HTML confirmation email after successful booking payment.
Business Context: The booking confirmation email is a key touchpoint. It provides the customer with their booking details and serves as their ticket/receipt.
Acceptance Criteria:
Email sent after successful payment (webhook)
HTML template with all booking details
Includes: event name, date, time, venue, tickets, price
Includes: booking reference prominently
Professional, branded design
Fallback plain text version
Sent asynchronously (doesn't block webhook response)
Email Template Content:
Subject: "Your TicketHub Booking Confirmation - {bookingReference}"
Header with logo
Greeting: "Hi {userName},"
Success message
Booking Details:
Event: {eventName}
Artist: {artistName}
Date: {eventDate} at {eventTime}
Venue: {venueName}
Address: {venueAddress}
Tickets: {quantity}
Total: ${totalPrice}
Booking Reference: {bookingReference} (large, clear)
What's Next section
Footer with contact info
Technical Considerations:
Trigger from webhook handler
Use @Async to not block webhook
Log email send result
Handle template errors gracefully
Consider retry on send failure
Trigger Point:
In payment_intent.succeeded webhook handler
After booking status updated to CONFIRMED
Call emailService.sendBookingConfirmation(booking) asynchronously
Testing Requirements:
Test email content accuracy
Test template rendering
Test async behavior
Visual test (send to real inbox)
Definition of Done:
Template created
Integration with webhook
Async sending
Template tested visually
Code reviewed and merged

TH-414: Event Cancellation Notification
Type: Feature Priority: Medium Estimate: 2 hours Assignee: Developer Labels: backend, email Blocked By: TH-412
Summary: Notify all booked users when an event is cancelled by admin. Include refund information.
Business Context: When an event is cancelled, all customers with bookings must be notified immediately. They need to know about refunds and next steps.
Acceptance Criteria:
Email sent to all users with bookings for cancelled event
Triggered when admin cancels event
Includes refund information
Sent asynchronously in batches
Handles large number of bookings
Email Template Content:
Subject: "Important: {eventName} Has Been Cancelled"
Apology message
Event details that were cancelled
Refund information:
Refund amount: ${amount}
"Refund will be processed within 5-10 business days"
Booking reference for records
Contact information for questions
Trigger Point:
In EventService.cancelEvent() method
After event status updated to CANCELLED
Fetch all CONFIRMED bookings for event
Send emails asynchronously
Technical Considerations:
Batch processing for events with many bookings
Rate limiting (SendGrid limits)
Consider background job for very large events
Log all notifications sent
Handle partial failures (some emails fail)
Testing Requirements:
Test with multiple bookings
Test batch processing
Test template content
Test rate limiting handling
Definition of Done:
Template created
Integration with cancel event
Batch processing
Tests passing
Code reviewed and merged

TH-415: Event Reminder Email Job
Type: Feature Priority: Low Estimate: 3 hours Assignee: Developer Labels: backend, email, scheduled-job Blocked By: TH-412
Summary: Send reminder emails to booked users 24 hours before their event.
Business Context: Reminder emails reduce no-shows and improve customer experience. A day before is the sweet spot — enough time to prepare but close enough to be relevant.
Acceptance Criteria:
Scheduled job runs daily
Finds events happening in next 24 hours
Sends reminder to all confirmed bookings
Tracks which reminders were sent (no duplicates)
Handles errors without stopping job
Email Template Content:
Subject: "Reminder: {eventName} is Tomorrow!"
Excitement/anticipation message
Event details (date, time, venue, address)
Booking details (reference, tickets)
Tips for the event
Map link to venue (optional)
Job Logic:
Find events where:
status = PUBLISHED
eventDateTime BETWEEN now+23hours AND now+25hours
For each event:
Find CONFIRMED bookings
Filter out already-reminded (if tracked)
Send reminder emails
Mark as reminded
Configuration:
tickethub.jobs.event-reminder.enabled=true
tickethub.jobs.event-reminder.cron=0 0 8 * * * (8 AM daily)
tickethub.jobs.event-reminder.hours-before=24
Technical Considerations:
Run once daily at reasonable hour
Track sent reminders to prevent duplicates
Batch processing
Consider timezone handling
Testing Requirements:
Test job finds correct events
Test reminder tracking
Test email content
Definition of Done:
Scheduled job created
Template created
Duplicate prevention
Tests passing
Code reviewed and merged

PHASE 5: KUBERNETES & AWS
Duration: Week 5 Goal: Deploy application to AWS using Kubernetes (EKS) with infrastructure managed by Terraform Dependencies: Phase 4 (Docker, Redis, Payments) complete Deliverables: Production-ready AWS deployment with EKS, RDS, ElastiCache

EPIC: LOCAL KUBERNETES
TH-501: Install Kubernetes Tools
Type: Setup Priority: High Estimate: 1 hour Assignee: Developer Labels: devops, kubernetes, setup
Summary: Install and configure local Kubernetes development tools: kubectl and minikube.
Business Context: Before deploying to AWS EKS, we practice with local Kubernetes using minikube. This allows learning K8s concepts without cloud costs.
Acceptance Criteria:
kubectl installed and in PATH
minikube installed and running
kubectl get nodes shows minikube node
Basic K8s concepts understood
Cheat sheet created for common commands
Installation Steps (Mac):
brew install kubectl
brew install minikube
minikube start --memory=4096 --cpus=2
kubectl get nodes
Verify Installation:
kubectl version --client
minikube status
kubectl cluster-info
Key Concepts to Understand:
Pod: Smallest deployable unit
Deployment: Manages pod replicas
Service: Exposes pods to network
ConfigMap: Non-sensitive configuration
Secret: Sensitive configuration
Namespace: Logical isolation
Ingress: External HTTP routing
Common Commands Cheat Sheet:
kubectl get pods
kubectl get services
kubectl get deployments
kubectl logs <pod-name>
kubectl describe pod <pod-name>
kubectl apply -f <file.yaml>
kubectl delete -f <file.yaml>
minikube dashboard (opens UI)
Testing Requirements:
Run sample nginx deployment
Access via minikube service
Definition of Done:
kubectl working
minikube running
Sample deployment successful
Cheat sheet created
Concepts understood

TH-502: Create Kubernetes Deployment Manifest
Type: DevOps Priority: High Estimate: 3 hours Assignee: Developer Labels: devops, kubernetes Blocked By: TH-501, TH-401
Summary: Create Kubernetes Deployment manifest for the TicketHub application.
Business Context: A Deployment tells Kubernetes how to run our application: how many replicas, what image, resource limits, health checks, etc.
Acceptance Criteria:
deployment.yaml created in k8s/ directory
Uses our Docker image
2 replicas configured
Resource requests and limits defined
Liveness probe configured
Readiness probe configured
Environment variables from ConfigMap/Secrets
Rolling update strategy
Manifest Structure:
k8s/deployment.yaml:
apiVersion: apps/v1
kind: Deployment
metadata: name, labels
spec:
replicas: 2
selector: matchLabels
strategy: RollingUpdate
template:
containers:
name, image
ports: 8080
resources: requests/limits
livenessProbe: /actuator/health/liveness
readinessProbe: /actuator/health/readiness
envFrom: configMapRef, secretRef
Resource Configuration:
requests: memory: 512Mi, cpu: 250m
limits: memory: 1Gi, cpu: 500m
Health Probes:
Liveness: Restart container if unhealthy
httpGet: /actuator/health/liveness
initialDelaySeconds: 30
periodSeconds: 10
Readiness: Don't send traffic until ready
httpGet: /actuator/health/readiness
initialDelaySeconds: 15
periodSeconds: 5
Rolling Update:
maxSurge: 1 (one extra pod during update)
maxUnavailable: 0 (always maintain min replicas)
Technical Considerations:
Use specific image tag, not :latest
Add labels for organization
Consider pod anti-affinity for HA (future)
Add pod disruption budget (future)
Testing Requirements:
Deploy to minikube
Verify 2 replicas running
Verify health checks working
Test rolling update
Definition of Done:
Manifest created
Deploys to minikube
Health checks passing
Rolling update works
Code reviewed and merged

TH-503: Create Kubernetes Service Manifest
Type: DevOps Priority: High Estimate: 2 hours **Assignee
Continue
11:14 AM
:** Developer Labels: devops, kubernetes Blocked By: TH-502
Summary: Create Kubernetes Service to expose the application pods.
Business Context: Services provide stable networking for pods. Since pods are ephemeral (they come and go), the Service provides a consistent endpoint.
Acceptance Criteria:
service.yaml created
ClusterIP type for internal access
Port 80 → target port 8080
Selector matches deployment labels
Service accessible within cluster
Manifest Structure:
k8s/service.yaml:
apiVersion: v1
kind: Service
metadata: name
spec:
type: ClusterIP
ports:
port: 80
targetPort: 8080
selector: matches deployment labels
Service Types:
ClusterIP: Internal only (default)
NodePort: Exposed on each node's IP
LoadBalancer: Cloud provider load balancer (we'll use this for AWS)
Technical Considerations:
Labels must match deployment
Consider adding session affinity if needed
Port naming for multi-port services
Testing Requirements:
Service created successfully
Can access pods via service
kubectl port-forward works
Definition of Done:
Service manifest created
Service connects to pods
Tested via port-forward
Code reviewed and merged

TH-504: Create ConfigMap & Secrets Manifests
Type: DevOps Priority: High Estimate: 2 hours Assignee: Developer Labels: devops, kubernetes Blocked By: TH-502
Summary: Externalize configuration using Kubernetes ConfigMaps for non-sensitive data and Secrets for sensitive data.
Business Context: Configuration should be separate from code. ConfigMaps and Secrets allow us to configure the same image differently for dev, staging, and production.
Acceptance Criteria:
configmap.yaml with non-sensitive config
secrets.yaml with sensitive config (template only)
Deployment references both
Application reads config correctly
Secrets not committed to git
ConfigMap Contents (Non-Sensitive):
SPRING_PROFILES_ACTIVE
SERVER_PORT
Feature flags
Logging levels
k8s/configmap.yaml:
SPRING_PROFILES_ACTIVE: kubernetes
SERVER_PORT: "8080"
LOGGING_LEVEL_ROOT: INFO
Secret Contents (Sensitive):
DATABASE_URL
DATABASE_USERNAME
DATABASE_PASSWORD
REDIS_HOST
REDIS_PASSWORD
JWT_SECRET
STRIPE_SECRET_KEY
STRIPE_WEBHOOK_SECRET
SENDGRID_API_KEY
k8s/secrets.yaml (TEMPLATE - git-ignored):
yaml
apiVersion: v1
kind: Secret
metadata:
  name: tickethub-secrets
type: Opaque
data:
  DATABASE_URL: <base64-encoded>
  # ... other secrets base64 encoded
```

**Secret Handling:**
- Create secrets.yaml.template (committed)
- Actual secrets.yaml is git-ignored
- Use kubectl create secret for real deployments
- Consider sealed-secrets or external-secrets (future)

**Technical Considerations:**
- Secrets are base64 encoded (not encrypted!)
- Use stringData for plain text (K8s encodes)
- Reference in deployment via envFrom
- Consider namespace isolation for secrets

**Testing Requirements:**
- ConfigMap applied successfully
- Secrets applied successfully
- Application reads config correctly
- Environment variables populated

**Definition of Done:**
- [ ] ConfigMap created
- [ ] Secret template created
- [ ] Deployment updated to use both
- [ ] Git ignore for real secrets
- [ ] Tests passing
- [ ] Code reviewed and merged

---

### TH-505: Deploy to Minikube

**Type:** DevOps
**Priority:** High
**Estimate:** 2 hours
**Assignee:** Developer
**Labels:** devops, kubernetes
**Blocked By:** TH-502, TH-503, TH-504

**Summary:**
Deploy the complete application stack to local minikube for testing Kubernetes configuration.

**Business Context:**
Before going to AWS, we validate everything works in local Kubernetes. This catches configuration issues early when they're easy to fix.

**Acceptance Criteria:**
1. All manifests applied successfully
2. Application running with 2 replicas
3. Can access via minikube service
4. Health checks passing
5. Logs visible via kubectl
6. Can scale replicas
7. Rolling update works

**Deployment Steps:**
1. Build Docker image: minikube image build -t tickethub:local .
2. Apply ConfigMap: kubectl apply -f k8s/configmap.yaml
3. Apply Secrets: kubectl apply -f k8s/secrets.yaml
4. Apply Deployment: kubectl apply -f k8s/deployment.yaml
5. Apply Service: kubectl apply -f k8s/service.yaml
6. Verify: kubectl get pods
7. Access: minikube service tickethub

**Verification Commands:**
- kubectl get pods -w (watch pods start)
- kubectl logs <pod-name> (view logs)
- kubectl describe pod <pod-name> (debug)
- kubectl scale deployment tickethub --replicas=3 (scale)

**For Database/Redis:**
- Option 1: Use Docker Compose external to K8s
- Option 2: Deploy Postgres/Redis to K8s (more complex)
- Recommend Option 1 for local development

**Testing Requirements:**
- All endpoints work
- Health endpoints respond
- Scaling works
- Logs accessible
- Document deployment process

**Definition of Done:**
- [ ] Application deployed to minikube
- [ ] All pods healthy
- [ ] Endpoints accessible
- [ ] Deployment documented
- [ ] README updated

---

## EPIC: AWS INFRASTRUCTURE

### TH-506: AWS Account & IAM Setup

**Type:** Setup
**Priority:** High
**Estimate:** 2 hours
**Assignee:** Developer
**Labels:** setup, aws

**Summary:**
Set up AWS account with proper IAM configuration for secure infrastructure management.

**Business Context:**
AWS hosts our production infrastructure. Proper IAM setup ensures security — we never use root account for daily operations.

**Acceptance Criteria:**
1. AWS account created
2. MFA enabled on root account
3. IAM user created for Terraform
4. Appropriate IAM policies attached
5. AWS CLI configured
6. Billing alerts enabled

**Setup Steps:**

1. **Create AWS Account:**
   - Sign up at aws.amazon.com
   - Verify email and phone
   - Enable MFA on root account immediately

2. **Create IAM User for Terraform:**
   - User name: terraform-admin
   - Access type: Programmatic access
   - Policy: AdministratorAccess (for learning; restrict in production)
   - Save access key ID and secret key securely

3. **Configure AWS CLI:**
   - aws configure
   - Enter access key ID, secret key
   - Default region: us-east-1 (or preferred)
   - Default output: json

4. **Enable Billing Alerts:**
   - Set budget alert at $10, $50, $100
   - Email notifications for approaching limit

**IAM Best Practices:**
- Never use root account for daily work
- Use IAM users with minimum required permissions
- Enable MFA on all users
- Rotate access keys regularly
- Use IAM roles for services (not users)

**Cost Awareness:**
- EKS: ~$0.10/hour for control plane
- EC2 (worker nodes): varies by instance type
- RDS: ~$0.02/hour for db.t3.micro
- ElastiCache: ~$0.02/hour for cache.t3.micro
- Set up AWS Cost Explorer
- Use Free Tier where possible

**Testing Requirements:**
- aws sts get-caller-identity works
- CLI can list S3 buckets
- Billing alerts configured

**Definition of Done:**
- [ ] Account created
- [ ] MFA enabled
- [ ] IAM user created
- [ ] CLI configured
- [ ] Billing alerts set
- [ ] Access keys secured

---

### TH-507: Terraform Project Setup

**Type:** DevOps
**Priority:** High
**Estimate:** 2 hours
**Assignee:** Developer
**Labels:** devops, terraform
**Blocked By:** TH-506

**Summary:**
Set up Terraform project structure and configure AWS provider with remote state storage.

**Business Context:**
Terraform manages our AWS infrastructure as code. Remote state in S3 ensures team collaboration and state safety.

**Acceptance Criteria:**
1. Terraform directory structure created
2. AWS provider configured
3. S3 backend for state storage
4. DynamoDB for state locking (optional)
5. terraform init succeeds
6. Variables and outputs files created

**Directory Structure:**
```
terraform/
├── main.tf           # Main configuration
├── variables.tf      # Input variables
├── outputs.tf        # Output values
├── providers.tf      # Provider configuration
├── backend.tf        # State backend config
├── versions.tf       # Version constraints
└── environments/
    ├── dev.tfvars    # Dev environment values
    └── prod.tfvars   # Prod environment values
Initial Setup:
terraform/providers.tf:
hcl
provider "aws" {
  region = var.aws_region
}
terraform/versions.tf:
hcl
terraform {
  required_version = ">= 1.5.0"
  required_providers {
    aws = {
      source  = "hashicorp/aws"
      version = "~> 5.0"
    }
  }
}
terraform/variables.tf:
hcl
variable "aws_region" {
  description = "AWS region"
  default     = "us-east-1"
}

variable "environment" {
  description = "Environment name"
}

variable "project_name" {
  description = "Project name"
  default     = "tickethub"
}
State Backend Setup:
Manually create S3 bucket: tickethub-terraform-state
Enable versioning on bucket
Create DynamoDB table: tickethub-terraform-locks (optional)
terraform/backend.tf:
hcl
terraform {
  backend "s3" {
    bucket         = "tickethub-terraform-state"
    key            = "terraform.tfstate"
    region         = "us-east-1"
    encrypt        = true
    dynamodb_table = "tickethub-terraform-locks"
  }
}
```

**Testing Requirements:**
- terraform init completes
- terraform plan works
- State stored in S3

**Definition of Done:**
- [ ] Directory structure created
- [ ] Provider configured
- [ ] S3 backend created
- [ ] terraform init succeeds
- [ ] Code reviewed and merged

---

### TH-508: VPC & Networking with Terraform

**Type:** DevOps
**Priority:** High
**Estimate:** 4 hours
**Assignee:** Developer
**Labels:** devops, terraform, networking
**Blocked By:** TH-507

**Summary:**
Create VPC and networking infrastructure for EKS, RDS, and ElastiCache.

**Business Context:**
VPC provides network isolation. We need public subnets (for load balancers) and private subnets (for EKS, RDS, ElastiCache).

**Acceptance Criteria:**
1. VPC created with CIDR block
2. Public subnets in 2 AZs
3. Private subnets in 2 AZs
4. Internet Gateway for public subnets
5. NAT Gateway for private subnets
6. Route tables configured
7. All resources tagged

**Network Architecture:**
```
VPC: 10.0.0.0/16
├── Public Subnet AZ-a: 10.0.1.0/24 (ALB)
├── Public Subnet AZ-b: 10.0.2.0/24 (ALB)
├── Private Subnet AZ-a: 10.0.10.0/24 (EKS, RDS, Redis)
└── Private Subnet AZ-b: 10.0.20.0/24 (EKS, RDS, Redis)
Resources to Create:
VPC with DNS support enabled
Internet Gateway attached to VPC
2 Public Subnets (different AZs)
2 Private Subnets (different AZs)
NAT Gateway (in public subnet)
Elastic IP for NAT Gateway
Public Route Table (routes to IGW)
Private Route Table (routes to NAT)
Subnet associations
Tags Required:
All resources tagged with:
Project = tickethub
Environment = dev/prod
ManagedBy = terraform
EKS-specific subnet tags (required for EKS):
kubernetes.io/cluster/{cluster-name} = shared
kubernetes.io/role/elb = 1 (public subnets)
kubernetes.io/role/internal-elb = 1 (private subnets)
Technical Considerations:
Multi-AZ for high availability
NAT Gateway per AZ for HA (cost optimization: single NAT for dev)
Use terraform-aws-modules/vpc for simplicity (or write from scratch for learning)
Enable VPC flow logs for debugging (optional)
Testing Requirements:
VPC created with correct CIDR
Subnets in different AZs
Internet access from public subnet
NAT access from private subnet
terraform plan shows no changes after apply
Definition of Done:
VPC configuration written
All subnets created
Gateways configured
Route tables correct
terraform apply succeeds
Code reviewed and merged

TH-509: RDS PostgreSQL with Terraform
Type: DevOps Priority: High Estimate: 3 hours Assignee: Developer Labels: devops, terraform, database Blocked By: TH-508
Summary: Provision RDS PostgreSQL database instance using Terraform.
Business Context: RDS provides managed PostgreSQL — AWS handles backups, patching, and failover. It's more reliable and less operational burden than self-managed.
Acceptance Criteria:
RDS PostgreSQL 15 instance created
In private subnet (no public access)
Security group allows EKS access only
Encryption at rest enabled
Automated backups enabled
Credentials stored in Secrets Manager
Outputs include endpoint and port
RDS Configuration:
Engine: PostgreSQL 15
Instance class: db.t3.micro (free tier eligible)
Storage: 20GB gp2 (adjustable)
Multi-AZ: false (dev), true (prod)
Publicly accessible: false
Database name: tickethub
Backup retention: 7 days
Maintenance window: Sun 03:00-04:00
Security Group Rules:
Inbound: PostgreSQL (5432) from EKS security group
Outbound: None needed
Subnet Group:
Use private subnets only
Spans multiple AZs for failover capability
Credentials Management:
Generate random password with random_password resource
Store in AWS Secrets Manager
Reference from EKS pods via external-secrets
Technical Considerations:
db.t3.micro for development (free tier)
Enable deletion protection in production
Consider parameter group for tuning
Enable Performance Insights (optional)
Don't store password in Terraform state (use Secrets Manager)
Outputs:
rds_endpoint
rds_port
rds_database_name
rds_secret_arn (reference to Secrets Manager)
Testing Requirements:
RDS instance created
Can connect from EC2 in same VPC
Backups enabled
Encryption verified
Definition of Done:
RDS configuration written
Security group configured
Secrets in Secrets Manager
terraform apply succeeds
Connection tested
Code reviewed and merged

TH-510: ElastiCache Redis with Terraform
Type: DevOps Priority: High Estimate: 2 hours Assignee: Developer Labels: devops, terraform, redis Blocked By: TH-508
Summary: Provision ElastiCache Redis cluster using Terraform for distributed locking and caching.
Business Context: ElastiCache Redis provides managed Redis — AWS handles failover, patching, and backups. It's used for distributed locking and caching.
Acceptance Criteria:
ElastiCache Redis 7 cluster created
In private subnet
Security group allows EKS access only
Auth token enabled
Encryption in transit enabled
Outputs include endpoint
ElastiCache Configuration:
Engine: Redis 7.0
Node type: cache.t3.micro
Number of nodes: 1 (dev), 2+ (prod with cluster mode)
Multi-AZ: disabled (dev), enabled (prod)
Automatic failover: disabled (dev), enabled (prod)
Transit encryption: enabled
At-rest encryption: enabled
Auth token: yes
Security Group Rules:
Inbound: Redis (6379) from EKS security group
Outbound: None needed
Subnet Group:
Use private subnets
Multiple AZs for failover
Auth Token:
Generate random token
Store in Secrets Manager
Reference from EKS pods
Technical Considerations:
cache.t3.micro for development
Consider cluster mode for production
Snapshot for backups (optional)
Parameter group for tuning (optional)
Outputs:
redis_endpoint
redis_port
redis_auth_token_secret_arn
Testing Requirements:
Redis cluster created
Can connect from EC2 in VPC
Auth token required
TLS working
Definition of Done:
ElastiCache configuration written
Security group configured
Auth token in Secrets Manager
terraform apply succeeds
Connection tested
Code reviewed and merged

TH-511: ECR Repository with Terraform
Type: DevOps Priority: High Estimate: 1 hour Assignee: Developer Labels: devops, terraform Blocked By: TH-507
Summary: Create ECR repository for storing Docker images.
Business Context: ECR is AWS's container registry. It stores our Docker images securely and integrates seamlessly with EKS.
Acceptance Criteria:
ECR repository created
Image scanning enabled
Lifecycle policy for cleanup
Outputs include repository URL
Can push/pull images
ECR Configuration:
Repository name: tickethub
Image tag mutability: MUTABLE
Scan on push: enabled
Encryption: AES256
Lifecycle Policy:
Keep last 10 images
Expire untagged images after 1 day
Outputs:
ecr_repository_url
ecr_repository_arn
Push Commands (for reference):
bash
aws ecr get-login-password --region us-east-1 | docker login --username AWS --password-stdin <account-id>.dkr.ecr.us-east-1.amazonaws.com
docker build -t tickethub .
docker tag tickethub:latest <account-id>.dkr.ecr.us-east-1.amazonaws.com/tickethub:latest
docker push <account-id>.dkr.ecr.us-east-1.amazonaws.com/tickethub:latest
Testing Requirements:
Repository created
Can push image
Can pull image
Scan results visible
Definition of Done:
ECR configuration written
Lifecycle policy set
terraform apply succeeds
Push/pull tested
Code reviewed and merged

TH-512: EKS Cluster with Terraform
Type: DevOps Priority: High Estimate: 6 hours Assignee: Developer Labels: devops, terraform, kubernetes, critical-path Blocked By: TH-508
Summary: Provision EKS (Elastic Kubernetes Service) cluster using Terraform. This is the Kubernetes control plane and worker nodes in AWS.
Business Context: EKS is managed Kubernetes — AWS manages the control plane, we manage worker nodes. It provides production-grade Kubernetes without the operational complexity.
Acceptance Criteria:
EKS cluster created in private subnets
Managed node group with 2 nodes
kubectl configured to access cluster
Cluster add-ons installed
OIDC provider configured
Outputs include cluster endpoint
EKS Configuration:
Cluster name: tickethub-dev
Kubernetes version: 1.28
Private endpoint access: enabled
Public endpoint access: enabled (for kubectl)
Logging: enabled (API, audit, authenticator)
Node Group Configuration:
Node group name: tickethub-workers
Instance types: t3.small
Desired size: 2
Min size: 1
Max size: 4
AMI type: AL2_x86_64
Capacity type: ON_DEMAND
Add-ons:
vpc-cni: Pod networking
coredns: DNS
kube-proxy: Network proxy
IAM Configuration:
Cluster IAM role
Node group IAM role
OIDC provider for IRSA (IAM Roles for Service Accounts)
Security Group:
Cluster security group (managed by EKS)
Allow node-to-node communication
Allow node-to-control plane
Technical Considerations:
Use terraform-aws-modules/eks or write from scratch
EKS control plane costs ~$72/month
Consider Spot instances for cost savings (prod)
Configure aws-auth ConfigMap for kubectl access
Enable cluster autoscaler (future)
kubectl Configuration:
bash
aws eks update-kubeconfig --region us-east-1 --name tickethub-dev
kubectl get nodes
Outputs:
cluster_endpoint
cluster_name
cluster_certificate_authority_data
node_group_arn
Testing Requirements:
Cluster created successfully
Nodes join cluster
kubectl works
Can deploy test pod
Definition of Done:
EKS configuration written
Node group configured
Add-ons installed
kubectl access working
Test deployment succeeds
Code reviewed and merged

TH-513: Deploy Application to EKS
Type: DevOps Priority: High Estimate: 4 hours Assignee: Developer Labels: devops, kubernetes Blocked By: TH-512, TH-509, TH-510, TH-511
Summary: Deploy the TicketHub application to EKS, connected to RDS and ElastiCache.
Business Context: This is where everything comes together — our application running in production Kubernetes, connected to managed databases.
Acceptance Criteria:
Kubernetes manifests updated for EKS
Secrets from AWS Secrets Manager
Application connects to RDS
Application connects to ElastiCache
Health checks passing
Pods running and stable
Updated Manifests:
Deployment Changes:
Image from ECR repository
Service account with IAM role (IRSA)
Resource limits appropriate for t3.small nodes
Secrets Strategy:
Option 1: External Secrets Operator (recommended)
Syncs AWS Secrets Manager → Kubernetes Secrets
Install via Helm
Option 2: Manual secret creation
kubectl create secret (less secure, manual)
External Secrets Operator Setup:
Install ESO via Helm
Create SecretStore pointing to AWS Secrets Manager
Create ExternalSecret resources
ESO syncs secrets automatically
Environment Variables:
DATABASE_URL from AWS Secrets Manager
REDIS_HOST from ElastiCache endpoint
REDIS_AUTH_TOKEN from AWS Secrets Manager
STRIPE_* from AWS Secrets Manager
SENDGRID_API_KEY from AWS Secrets Manager
Deployment Steps:
Push image to ECR
Install External Secrets Operator
Create SecretStore and ExternalSecrets
Apply ConfigMap
Apply Deployment
Apply Service
Verify pods healthy
Technical Considerations:
IAM role for service account (IRSA) for Secrets Manager access
Update DATABASE_URL for RDS endpoint
Update REDIS_HOST for ElastiCache endpoint
Consider init container for database migrations
Liveness/readiness probes must account for cold start
Testing Requirements:
Pods start successfully
Application logs show successful connections
Health endpoints respond
Can create booking (full flow test)
Definition of Done:
Manifests updated
Secrets synced from AWS
Application deployed
Connections working
Health checks passing
Documentation updated
Code reviewed and merged

TH-514: Configure ALB & Public Access
Type: DevOps Priority: Medium Estimate: 3 hours Assignee: Developer Labels: devops, kubernetes, networking Blocked By: TH-513
Summary: Set up Application Load Balancer for public access to the application using AWS Load Balancer Controller.
Business Context: ALB provides the public entry point to our application with SSL termination, health checks, and automatic scaling integration.
Acceptance Criteria:
AWS Load Balancer Controller installed
Ingress resource created
ALB provisioned automatically
HTTPS enabled with ACM certificate
HTTP redirects to HTTPS
Health checks configured
Application publicly accessible
AWS Load Balancer Controller Setup:
Create IAM policy for controller
Create IAM role with OIDC
Install controller via Helm
Ingress Resource:
yaml
apiVersion: networking.k8s.io/v1
kind: Ingress
metadata:
  name: tickethub-ingress
  annotations:
    kubernetes.io/ingress.class: alb
    alb.ingress.kubernetes.io/scheme: internet-facing
    alb.ingress.kubernetes.io/target-type: ip
    alb.ingress.kubernetes.io/certificate-arn: <acm-cert-arn>
    alb.ingress.kubernetes.io/listen-ports: '[{"HTTP": 80}, {"HTTPS": 443}]'
    alb.ingress.kubernetes.io/ssl-redirect: '443'
spec:
  rules:
    - http:
        paths:
          - path: /
            pathType: Prefix
            backend:
              service:
                name: tickethub
                port:
                  number: 80
ACM Certificate (Optional but Recommended):
Request certificate in ACM
Validate via DNS or email
Reference ARN in Ingress annotation
Custom Domain (Optional):
Register domain (Route 53 or external)
Create hosted zone
Create A record pointing to ALB
Update certificate for domain
Technical Considerations:
ALB controller runs in cluster
Creates ALB automatically from Ingress
Can use target groups for advanced routing
Consider WAF integration (future)
Testing Requirements:
ALB created automatically
HTTP redirects to HTTPS
Application accessible via ALB URL
Health checks green in AWS console
Definition of Done:
LB Controller installed
Ingress created
ALB provisioned
HTTPS working
Application accessible
Documentation updated
Code reviewed and merged

PHASE 6: CI/CD, TESTING & DOCUMENTATION
Duration: Week 6 Goal: Automate build/deploy, comprehensive testing, load testing, and portfolio-ready documentation Dependencies: Phase 5 (Kubernetes, AWS) complete Deliverables: GitHub Actions pipeline, tests, load tests, documentation, demo

EPIC: CI/CD PIPELINE
TH-601: GitHub Actions - Build & Test
Type: DevOps Priority: High Estimate: 3 hours Assignee: Developer Labels: devops, ci-cd Blocked By: None (can start anytime)
Summary: Create GitHub Actions workflow for automated build and test on every push and pull request.
Business Context: CI/CD ensures code quality and enables rapid iteration. Every change is automatically built and tested before merge.
Acceptance Criteria:
Workflow triggers on push to main and PRs
Builds application with Maven
Runs unit tests
Runs integration tests
Caches Maven dependencies
Reports test results
Build status badge in README
Workflow File:
.github/workflows/ci.yml:
name: CI
on: push (main), pull_request
jobs:
build:
Checkout code
Setup Java 17
Cache Maven dependencies
Build with Maven
Run tests
Upload test results
Job Steps:
actions/checkout@v4
actions/setup-java@v4 (temurin 17)
actions/cache@v4 (Maven .m2)
mvn verify
Upload test results artifact
Technical Considerations:
Use matrix for multiple Java versions (optional)
Fail fast on test failures
Set timeout to prevent hanging jobs
Use concurrency to cancel outdated builds
Testing Requirements:
Workflow triggers correctly
Build succeeds
Tests run and report
Cache improves speed
Definition of Done:
Workflow file created
Build passing
Tests running
Cache working
Badge in README
Code reviewed and merged

TH-602: Security Scanning
Type: DevOps Priority: High Estimate: 2 hours Assignee: Developer Labels: devops, security Blocked By: TH-601
Summary: Add security scanning for dependencies and container images.
Business Context: Security vulnerabilities in dependencies are a major risk. Automated scanning catches issues before they reach production.
Acceptance Criteria:
OWASP Dependency Check runs in CI
Trivy scans Docker image
Build fails on high severity vulnerabilities
Report uploaded as artifact
Suppressions file for false positives
OWASP Dependency Check:
Add Maven plugin
Run during verify phase
Fail on CVSS >= 7
Generate HTML report
Trivy Container Scan:
Scan built Docker image
Fail on HIGH and CRITICAL
Output in sarif format
Workflow Addition:
Add security-scan job
Depends on build job
Uploads scan reports
Technical Considerations:
OWASP check takes 5+ minutes (NVD download)
Cache NVD data to speed up
Create suppression file for false positives
Consider running on schedule (nightly) for speed
Testing Requirements:
Scans complete successfully
Known vulnerabilities detected
Reports accessible
Definition of Done:
OWASP check configured
Trivy scanning added
Failure thresholds set
Reports uploaded
Code reviewed and merged

TH-603: Docker Build & Push to ECR
Type: DevOps Priority: High Estimate: 2 hours Assignee: Developer Labels: devops, ci-cd Blocked By: TH-601, TH-511
Summary: Automate Docker image building and pushing to ECR in CI pipeline.
Business Context: Every successful build on main should produce a deployable Docker image, tagged with the git SHA for traceability.
Acceptance Criteria:
Docker image built in CI
Image tagged with git SHA and 'latest'
Image pushed to ECR
Only runs on main branch (not PRs)
Uses OIDC for AWS authentication
Image scan results checked
Workflow Addition:
Add docker job after tests pass
Condition: only on main branch
Steps:
Configure AWS credentials (OIDC)
Login to ECR
Build image
Tag with SHA and latest
Push to ECR
Wait for scan results
AWS OIDC Setup:
Create OIDC provider in AWS for GitHub
Create IAM role for GitHub Actions
Trust policy for specific repo
Permissions for ECR push
Image Tags:
{sha}: Unique identifier for this commit
latest: Most recent build
v{version}: Version tags (optional)
Technical Considerations:
Use docker/build-push-action@v5
Multi-platform builds (optional)
Layer caching for speed
Don't push on PRs (security)
Testing Requirements:
Image builds in CI
Push to ECR succeeds
Image pullable from ECR
Tags correct
Definition of Done:
OIDC configured
Docker job added
Image pushed to ECR
Tags correct
Only runs on main
Code reviewed and merged

TH-604: Automated Deployment to Staging
Type: DevOps Priority: High Estimate: 3 hours Assignee: Developer Labels: devops, ci-cd Blocked By: TH-603, TH-513
Summary: Automate deployment to staging environment after successful image push.
Business Context: Continuous deployment to staging enables rapid feedback. Every merge to main automatically deploys to staging for testing.
Acceptance Criteria:
Deployment triggered after image push
Updates Kubernetes deployment with new image
Waits for rollout to complete
Runs smoke tests after deployment
Rollback on failed smoke tests
Notifies on success/failure
Workflow Addition:
Add deploy-staging job
Depends on docker job
Steps:
Configure AWS credentials
Update kubeconfig for EKS
Update deployment image
Wait for rollout
Run smoke tests
Rollback if tests fail
Deployment Strategy:
bash
kubectl set image deployment/tickethub tickethub=$ECR_REPO:$SHA
kubectl rollout status deployment/tickethub --timeout=300s
Smoke Tests:
Health endpoint responds
Can list events
Basic functionality check
Rollback:
bash
kubectl rollout undo deployment/tickethub
Notifications:
Slack webhook (optional)
GitHub deployment status
Technical Considerations:
Use staging namespace
Separate kubeconfig for staging
Timeout for rollout
Retry logic for flaky deployments
Testing Requirements:
Deployment completes
New version running
Smoke tests pass
Rollback works
Definition of Done:
Deploy job created
Image update working
Rollout monitored
Smoke tests running
Rollback configured
Code reviewed and merged

TH-605: Production Deployment with Approval
Type: DevOps Priority: High Estimate: 2 hours Assignee: Developer Labels: devops, ci-cd Blocked By: TH-604
Summary: Add manual approval gate before production deployment.
Business Context: Production deployments should require human approval. This prevents accidental deployments and ensures review.
Acceptance Criteria:
Production deployment requires manual approval
Approval notification sent
Same image as staging (promoted, not rebuilt)
Deployment logs auditable
Rollback procedure documented
GitHub Environment Setup:
Create "production" environment in repo settings
Add required reviewers
Add deployment branch restriction (main only)
Add environment secrets if different from staging
Workflow Addition:
Add deploy-production job
Environment: production (requires approval)
Depends on: deploy-staging
Same steps as staging but different context
Approval Flow:
Staging deploys automatically
Team tests in staging
Reviewer approves production deployment
Production deploys same image
Technical Considerations:
Use GitHub Environments feature
Different kubeconfig for production
May have different secrets
Consider deployment windows
Testing Requirements:
Approval prompt appears
Only runs after approval
Correct image deployed
Audit trail visible
Definition of Done:
Production environment configured
Approval required
Deployment works after approval
Audit trail visible
Code reviewed and merged

EPIC: TESTING
TH-606: Unit Tests for Services
Type: Testing Priority: High Estimate: 6 hours Assignee: Developer Labels: testing Blocked By: All services must exist
Summary: Write comprehensive unit tests for all service classes achieving >90% coverage.
Business Context: Unit tests validate business logic in isolation. They're fast, reliable, and catch bugs early. High coverage demonstrates professional code quality.
Acceptance Criteria:
VenueService: >90% coverage
EventService: >90% coverage
BookingService: >90% coverage
PaymentService: >90% coverage
All edge cases covered
Tests follow AAA pattern
Meaningful test names with @DisplayName
Test Structure Per Service:
VenueServiceTest:
createVenue_ValidInput_ReturnsVenue
createVenue_NullName_ThrowsException
getVenueById_ExistingId_ReturnsVenue
getVenueById_NonExistingId_ThrowsNotFoundException
updateVenue_ValidInput_ReturnsUpdatedVenue
deleteVenue_ExistingId_DeletesVenue
getAllVenues_ReturnsPagedResults
EventServiceTest:
createEvent_ValidInput_ReturnsEvent
createEvent_VenueNotFound_ThrowsException
createEvent_CapacityExceedsVenue_ThrowsException
publishEvent_DraftEvent_ChangesStatusToPublished
publishEvent_AlreadyPublished_ThrowsException
cancelEvent_PublishedEvent_ChangesStatusToCancelled
searchEvents_ReturnsMatchingEvents
BookingServiceTest:
createBooking_ValidInput_ReturnsBooking
createBooking_InsufficientTickets_ThrowsException
createBooking_EventNotPublished_ThrowsException
createBooking_EventInPast_ThrowsException
cancelBooking_ValidBooking_RestoresTickets
cancelBooking_AlreadyCancelled_ThrowsException
PaymentServiceTest:
createPaymentIntent_ValidBooking_ReturnsClientSecret
handleWebhook_PaymentSucceeded_ConfirmsBooking
handleWebhook_PaymentFailed_UpdatesPaymentStatus
processRefund_ConfirmedBooking_RefundsPayment
Technical Considerations:
Use @ExtendWith(MockitoExtension.class)
Mock repository and external service calls
Use @InjectMocks for service under test
Use ArgumentCaptor for verifying saved entities
Test both success and failure paths
Testing Patterns:
Arrange: Set up test data and mocks
Act: Call method under test
Assert: Verify results and mock interactions
Definition of Done:
All service tests written
Coverage >90% per service
Edge cases covered
Tests passing
Code reviewed and merged

TH-607: Integration Tests for Booking Flow
Type: Testing Priority: High Estimate: 4 hours Assignee: Developer Labels: testing, integration Blocked By: TH-303
Summary: Write integration tests for the complete booking flow using Testcontainers for real database testing.
Business Context: Integration tests validate that components work together correctly. Testcontainers provides real PostgreSQL and Redis for accurate testing.
Acceptance Criteria:
Full booking flow tested end-to-end
Uses real PostgreSQL via Testcontainers
Uses real Redis via Testcontainers
Tests concurrent booking scenario
Tests payment webhook handling
Tests booking expiration
All tests isolated and repeatable
Test Scenarios:
BookingIntegrationTest:
completeBookingFlow_CreatesAndConfirmsBooking
Create user, venue, event
Create booking
Simulate payment webhook
Verify booking confirmed
Verify tickets decremented
concurrentBooking_OnlyAvailableTicketsBooked
Create event with 10 tickets
Spawn 20 concurrent booking requests
Verify exactly 10 succeed
Verify 10 fail with InsufficientTickets
Verify availableTickets = 0
bookingExpiration_ReleasesTickets
Create booking
Wait for expiration (or manipulate time)
Run expiration job
Verify booking expired
Verify tickets restored
bookingCancellation_RestoresTickets
Create and confirm booking
Cancel booking
Verify tickets restored
Verify refund initiated
Testcontainers Setup:
java
@Container
static PostgreSQLContainer<?> postgres = new PostgreSQLContainer<>("postgres:15-alpine");

@Container
static GenericContainer<?> redis = new GenericContainer<>("redis:7-alpine")
    .withExposedPorts(6379);
Technical Considerations:
Use @SpringBootTest with Testcontainers
Use @DynamicPropertySource for container URLs
Clean database between tests
Use @Transactional with rollback where appropriate
ExecutorService for concurrent tests
Concurrent Test Implementation:
java
@Test
void concurrentBooking_OnlyAvailableTicketsBooked() {
    // Create event with 10 tickets
    Event event = createEventWithTickets(10);
    
    // Create 20 concurrent booking tasks
    ExecutorService executor = Executors.newFixedThreadPool(20);
    List<Future<BookingResult>> futures = new ArrayList<>();
    
    for (int i = 0; i < 20; i++) {
        futures.add(executor.submit(() -> attemptBooking(event.getId(), 1)));
    }
    
    // Count results
    long successes = futures.stream()
        .filter(f -> f.get().isSuccess())
        .count();
    
    assertThat(successes).isEqualTo(10);
    assertThat(eventRepository.findById(event.getId()).get().getAvailableTickets()).isEqualTo(0);
}
Definition of Done:
Testcontainers configured
All scenarios tested
Concurrent test passing
Tests isolated
Code reviewed and merged

TH-608: Code Coverage Report
Type: Testing Priority: Medium Estimate: 2 hours Assignee: Developer Labels: testing, quality Blocked By: TH-606, TH-607
Summary: Set up JaCoCo for code coverage reporting with enforcement.
Business Context: Code coverage metrics demonstrate test quality. JaCoCo provides detailed reports and can fail builds below threshold.
Acceptance Criteria:
JaCoCo Maven plugin configured
Coverage report generated on build
Minimum 70% coverage enforced
Report uploaded in CI
Badge in README
Exclusions for DTOs and config
JaCoCo Configuration (pom.xml):
Add jacoco-maven-plugin
Execution: prepare-agent (before tests)
Execution: report (after tests)
Execution: check (enforce threshold)
Coverage Rules:
Overall: 70% minimum
Services: 90% minimum
Controllers: 80% minimum
Exclude: DTOs, config classes, entities
Exclusions:
**/.dto.
**/.config.
**/.entity.
**/Application.class
CI Integration:
Generate report during build
Upload as artifact
Consider Codecov integration for PR comments
Technical Considerations:
JaCoCo works with JUnit 5
Report formats: HTML, XML, CSV
Branch coverage vs line coverage
Exclude generated code (Lombok)
Testing Requirements:
Report generates correctly
Threshold enforced
CI uploads report
Badge displays correctly
Definition of Done:
JaCoCo configured
Report generating
Threshold enforced
CI integration
Badge in README
Code reviewed and merged

EPIC: LOAD TESTING & CHAOS ENGINEERING
TH-609: Load Testing Setup
Type: Testing Priority: High Estimate: 3 hours Assignee: Developer Labels: testing, performance Blocked By: TH-405
Summary: Set up load testing framework to simulate high concurrent traffic and validate system behavior under load.
Business Context: Load testing proves the system can handle real-world traffic. It validates our concurrency controls work under pressure and identifies performance bottlenecks.
Acceptance Criteria:
Load testing tool selected and configured (k6 or Gatling)
Test scenarios defined
Can simulate 100+ concurrent users
Results include response times and error rates
Test reports generated
Baseline performance established
Tool Selection: k6 (Recommended)
Written in Go, scriptable in JavaScript
Easy to use, great documentation
Built-in metrics and reporting
Can run locally or in cloud
Alternative: Gatling
Written in Scala
Good for complex scenarios
More setup required
Installation (k6):
bash
brew install k6  # Mac
Test Scenarios to Create:
1. Baseline Performance Test:
10 concurrent users
Duration: 2 minutes
All endpoints
Establish baseline metrics
2. Load Test:
100 concurrent users
Duration: 5 minutes
Focus on read endpoints (events, venues)
Target: <200ms p95 response time
3. Stress Test:
Ramp from 10 to 500 users
Find breaking point
Monitor error rates
Identify bottlenecks
4. Booking Concurrency Test:
50 users trying to book same event
Event has 20 tickets
Verify no overselling
Measure lock contention
Technical Considerations:
Run against staging environment
Don't run against production
Monitor application metrics during test
Database connection pool monitoring
Redis connection monitoring
Metrics to Track:
Response time (p50, p95, p99)
Error rate
Requests per second
Concurrent connections
Database query time
Redis lock acquisition time
Definition of Done:
k6 installed and configured
Test scripts created
Baseline established
Reports generated
Documented in README
Code reviewed and merged

TH-610: Concurrent Booking Load Test
Type: Testing Priority: High Estimate: 4 hours Assignee: Developer Labels: testing, performance, critical Blocked By: TH-609
Summary: Create specific load test for concurrent booking scenario to prove our double-locking strategy works under heavy load.
Business Context: This is THE test that validates the core technical achievement of the project. It proves that our distributed locking prevents overselling under realistic conditions.
Test Scenario:
Setup:
Create event with 100 tickets
200 virtual users ready to book
Each user tries to book 1 ticket
All requests sent within ~1 second
Expected Results:
Exactly 100 bookings succeed
Exactly 100 booking attempts fail with "insufficient tickets"
Zero overselling
Average response time <500ms
No deadlocks or timeouts
k6 Script Structure:
javascript
import http from 'k6/http';
import { check, sleep } from 'k6';

export let options = {
  scenarios: {
    booking_rush: {
      executor: 'shared-iterations',
      vus: 200,
      iterations: 200,
      maxDuration: '30s',
    },
  },
};

export default function () {
  // Login and get token
  const token = login();
  
  // Attempt booking
  const response = http.post(
    `${BASE_URL}/api/bookings`,
    JSON.stringify({ eventId: EVENT_ID, quantity: 1 }),
    { headers: { 'Authorization': `Bearer ${token}`, 'Content-Type': 'application/json' }}
  );
  
  // Track results
  check(response, {
    'booking succeeded': (r) => r.status === 201,
    'insufficient tickets': (r) => r.status === 409,
  });
}
Validation Script: After test, verify:
sql
SELECT COUNT(*) FROM bookings WHERE event_id = ? AND status != 'EXPIRED';
-- Should equal exactly 100

SELECT available_tickets FROM events WHERE id = ?;
-- Should equal exactly 0
Metrics to Capture:
Total successful bookings (must equal 100)
Total failed bookings (must equal 100)
Response time distribution
Lock acquisition times
Database transaction times
Multi-Instance Test:
Run same test with 2+ app instances
Use Docker Compose to scale: docker-compose up --scale app=3
Proves Redis distributed lock works
Reporting:
Generate HTML report
Include graphs: response times, errors over time
Screenshot final database state
Document for portfolio
Technical Considerations:
Create dedicated test event
Clean up after test
Run multiple times for consistency
Monitor server resources during test
Definition of Done:
Test script created
Single-instance test passing
Multi-instance test passing
Zero overselling verified
Report generated
Results documented
Code reviewed and merged

TH-611: Chaos Engineering - Redis Failure
Type: Testing Priority: Medium Estimate: 3 hours Assignee: Developer Labels: testing, chaos-engineering Blocked By: TH-405
Summary: Test system behavior when Redis becomes unavailable. Verify graceful degradation to database-only locking.
Business Context: Production systems must handle failures gracefully. Testing Redis failure ensures we don't have a single point of failure.
Test Scenario:
Setup:
Application running normally
Redis and PostgreSQL healthy
Load test in progress
Action:
Kill Redis container mid-test
docker-compose stop redis
Expected Behavior:
Application logs warning about Redis unavailability
Booking continues with database-only locking
No bookings fail solely due to Redis
Performance may degrade slightly
When Redis returns, system recovers
Verification:
Monitor logs for Redis warnings
Bookings still succeed
No data corruption
Recovery after Redis restart
Technical Considerations:
Fallback must be in code (TH-405)
Circuit breaker pattern (optional enhancement)
Alert/metric for Redis failures
Document expected behavior
Testing Steps:
Start all services
Run steady load (10 users booking)
Kill Redis: docker-compose stop redis
Observe: bookings continue with warnings
Restart Redis: docker-compose start redis
Observe: system recovers
Verify: no overselling, no data loss
Definition of Done:
Test procedure documented
Fallback behavior verified
Recovery tested
Results documented
Code reviewed and merged

TH-612: Chaos Engineering - Database Slowdown
Type: Testing Priority: Medium Estimate: 2 hours Assignee: Developer Labels: testing, chaos-engineering Blocked By: TH-610
Summary: Test system behavior when database becomes slow. Observe impact on booking flow.
Business Context: Database slowdowns happen in production (lock contention, resource exhaustion). Understanding system behavior helps plan capacity and set appropriate timeouts.
Test Scenario:
Setup:
Application running normally
Normal load test in progress
Action:
Introduce database latency
Option 1: Toxiproxy to add latency
Option 2: Run expensive query to load database
Option 3: Reduce connection pool size
Expected Behavior:
Response times increase
Lock wait times increase
Some requests may timeout
No data corruption
System recovers when latency removed
Metrics to Observe:
Response time increase
Connection pool exhaustion
Lock wait timeouts
Error rates
Timeout Validation:
Verify Redis lock timeout behavior
Verify database query timeouts
Verify API response timeouts
Technical Considerations:
Don't test on production!
Document timeout configurations
Consider circuit breaker (future)
Alert thresholds for latency
Definition of Done:
Test procedure documented
System behavior observed
Timeouts validated
Results documented
Recommendations noted

EPIC: DOCUMENTATION
TH-613: Comprehensive README
Type: Documentation Priority: High Estimate: 4 hours Assignee: Developer Labels: documentation
Summary: Write portfolio-quality README that showcases the project professionally.
Business Context: The README is the first thing recruiters and hiring managers see. It must clearly communicate what the project does, technical decisions, and your capabilities.
Acceptance Criteria:
Clear project overview
Architecture diagram
Technology stack with justifications
Local setup instructions
API documentation link
Screenshots or demo GIF
Deployment instructions
Key technical decisions highlighted
Contact information
README Structure:
1. Header:
Project name with logo/badge
One-line description
Key badges (build status, coverage)
2. Overview:
What is TicketHub?
Key features (bullet points)
Problem it solves
3. Demo:
Link to deployed application
Demo video link
Screenshots/GIF
4. Architecture:
High-level architecture diagram
Component descriptions
Data flow explanation
5. Technology Stack:
Backend (Java, Spring Boot, etc.)
Database (PostgreSQL, Redis)
Infrastructure (AWS, Kubernetes, Terraform)
CI/CD (GitHub Actions)
Brief justification for each choice
6. Key Technical Highlights:
Distributed locking strategy
Payment integration
Infrastructure as Code
CI/CD pipeline
7. Getting Started:
Prerequisites
Clone repository
Local setup (Docker Compose)
Run tests
Access application
8. API Documentation:
Link to Swagger UI
Key endpoints overview
9. Project Structure:
Directory layout
Module descriptions
10. Deployment:
Overview of deployment process
Link to detailed instructions
11. Testing:
How to run tests
Test coverage report
12. Roadmap:
Future enhancements
Known limitations
13. Contact:
LinkedIn
Email
Portfolio website
Diagrams (Create with Mermaid):
Architecture diagram
Sequence diagram for booking flow
Entity relationship diagram
Technical Considerations:
Use badges from shields.io
Embed images/diagrams
Keep instructions up to date
Use collapsible sections for long content
Definition of Done:
All sections written
Diagrams created
Screenshots added
Instructions tested
Proofread
Code reviewed and merged

TH-614: Swagger/OpenAPI Documentation
Type: Documentation Priority: High Estimate: 3 hours Assignee: Developer Labels: documentation, api
Summary: Add interactive API documentation using Swagger/OpenAPI.
Business Context: API documentation helps other developers (and interviewers) understand your API. Swagger provides interactive documentation where you can try endpoints.
Acceptance Criteria:
Springdoc OpenAPI dependency added
Swagger UI available at /swagger-ui.html
All endpoints documented
Request/response examples
Authentication documented
Error responses documented
Setup:
Add springdoc-openapi-starter-webmvc-ui dependency
Configure OpenAPI info (title, description, version)
Configure security scheme (JWT Bearer)
Annotations to Add:
Controller Level:
@Tag(name = "Events", description = "Event management operations")
Method Level:
@Operation(summary = "Create event", description = "Creates a new event")
@ApiResponse(responseCode = "201", description = "Event created")
@ApiResponse(responseCode = "400", description = "Invalid input")
Schema Level:
@Schema(description = "Event name", example = "Taylor Swift Concert")
Security Configuration:
Define JWT bearer security scheme
Apply to protected endpoints
Show lock icon for auth-required endpoints
Configuration Class:
java
@Configuration
public class OpenApiConfig {
    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
            .info(new Info()
                .title("TicketHub API")
                .version("1.0")
                .description("Event ticketing platform API"))
            .addSecurityItem(new SecurityRequirement().addList("Bearer"))
            .components(new Components()
                .addSecuritySchemes("Bearer",
                    new SecurityScheme()
                        .type(SecurityScheme.Type.HTTP)
                        .scheme("bearer")
                        .bearerFormat("JWT")));
    }
}
Technical Considerations:
Group endpoints by tag
Provide realistic examples
Document error responses
Hide internal endpoints
Testing Requirements:
Swagger UI loads
Can execute requests
Authentication works
Examples are accurate
Definition of Done:
Springdoc configured
All endpoints documented
Security scheme configured
Examples provided
Tested in browser
Code reviewed and merged

TH-615: Architecture Decision Records
Type: Documentation Priority: Medium Estimate: 3 hours Assignee: Developer Labels: documentation
Summary: Document key architectural decisions in ADR format for interview discussions.
Business Context: ADRs explain WHY decisions were made, not just what. They're excellent interview material — they show you think critically about trade-offs.
Acceptance Criteria:
ADR template created
ADRs for key decisions
Stored in docs/adr/ directory
Linked from README
ADR Template:
markdown
# ADR-001: [Decision Title]

## Status
Accepted | Superseded | Deprecated

## Context
What is the issue that we're seeing that is motivating this decision?

## Decision
What is the change that we're proposing and/or doing?

## Consequences
What becomes easier or more difficult to do because of this change?
```

**ADRs to Write:**

**ADR-001: PostgreSQL as Primary Database**
- Context: Need relational database for ACID transactions
- Decision: PostgreSQL over MySQL, MongoDB
- Consequences: Complex queries, JSONB for flexibility, strong ecosystem

**ADR-002: Double-Locking Strategy for Concurrency**
- Context: Prevent overselling with multiple app instances
- Decision: Redis distributed lock + PostgreSQL pessimistic lock
- Consequences: Added complexity, Redis dependency, but bulletproof concurrency

**ADR-003: Monolithic Architecture**
- Context: Single developer, learning project
- Decision: Monolith over microservices
- Consequences: Simpler deployment, lower latency, can refactor later

**ADR-004: Terraform for Infrastructure**
- Context: Need reproducible, version-controlled infrastructure
- Decision: Terraform over CloudFormation, Pulumi
- Consequences: Cloud-agnostic, large community, learning curve

**ADR-005: Stripe for Payments**
- Context: Need payment processing
- Decision: Stripe over Square, PayPal
- Consequences: Best DX, webhooks, PCI compliance handled

**ADR-006: EKS for Container Orchestration**
- Context: Need production-grade Kubernetes
- Decision: EKS over ECS, self-managed K8s
- Consequences: Managed control plane, AWS integration, cost

**Definition of Done:**
- [ ] Template created
- [ ] All ADRs written
- [ ] Stored in docs/adr/
- [ ] Linked from README
- [ ] Code reviewed and merged

---

## EPIC: DEMO & PORTFOLIO

### TH-616: Record Demo Video

**Type:** Marketing
**Priority:** High
**Estimate:** 4 hours
**Assignee:** Developer
**Labels:** marketing

**Summary:**
Create professional demo video showcasing the project for portfolio.

**Business Context:**
A demo video is worth a thousand words. Recruiters often won't run your code, but they'll watch a 5-minute video.

**Acceptance Criteria:**
1. 5-10 minutes long
2. Shows complete user journey
3. Explains technical highlights
4. Professional audio quality
5. Uploaded to YouTube
6. Linked in README and LinkedIn

**Video Structure:**

**1. Introduction (30 sec):**
- "Hi, I'm [Name], and this is TicketHub"
- Quick overview of what it does

**2. Architecture Overview (1 min):**
- Show architecture diagram
- Explain tech stack briefly
- Highlight key technical challenges

**3. Demo - User Journey (3 min):**
- Browse events
- Search and filter
- View event details
- Register/Login
- Book tickets
- Complete payment (Stripe test mode)
- View confirmation

**4. Admin Features (1 min):**
- Create venue
- Create event
- Publish event
- View bookings

**5. Technical Deep Dive (2 min):**
- Show code for distributed locking
- Explain the double-lock strategy
- Show concurrent test results
- Brief Kubernetes/Terraform overview

**6. Closing (30 sec):**
- Recap what you demonstrated
- Thank viewer
- Call to action (check out the code, connect on LinkedIn)

**Recording Tips:**
- Use Loom or OBS
- Quiet environment
- Script key points (don't read verbatim)
- Practice once before recording
- Edit out mistakes
- Add captions if possible

**Technical Considerations:**
- Use staging environment
- Have test data ready
- Clear browser history/cookies
- Use clean desktop
- Zoom in on important parts

**Definition of Done:**
- [ ] Script written
- [ ] Recording complete
- [ ] Edited and polished
- [ ] Uploaded to YouTube
- [ ] Linked everywhere
- [ ] Code reviewed and merged

---

### TH-617: Update Resume & LinkedIn

**Type:** Marketing
**Priority:** High
**Estimate:** 2 hours
**Assignee:** Developer
**Labels:** marketing

**Summary:**
Update professional profiles with TicketHub project details.

**Business Context:**
Your resume and LinkedIn are your marketing materials. They need to showcase this project with quantifiable achievements.

**Acceptance Criteria:**
1. Resume updated with project
2. LinkedIn updated with project
3. GitHub repo pinned
4. Portfolio website updated (if applicable)
5. Quantifiable achievements included

**Resume Updates:**

**Project Section:**
```
TicketHub - Cloud-Native Event Ticketing Platform
Java, Spring Boot, PostgreSQL, Redis, Kubernetes, AWS, Terraform

- Architected distributed ticketing system handling 1000+ concurrent 
  booking requests with zero overselling using Redis distributed locks
- Implemented double-locking concurrency strategy (Redis + PostgreSQL) 
  achieving 100% booking accuracy under load testing
- Deployed to AWS EKS with Terraform-managed infrastructure including 
  RDS, ElastiCache, and automated CI/CD via GitHub Actions
- Integrated Stripe payment processing with webhook handling, 
  achieving <500ms average booking response time
Key Metrics to Include:
Concurrent users supported
Response time percentiles
Zero overselling achievement
Test coverage percentage
Infrastructure components
LinkedIn Updates:
Add project to Projects section
Add technologies to Skills
Update About section
Share a post about completing the project
GitHub:
Pin repository
Add topics/tags
Ensure README is polished
Add social preview image
Definition of Done:
Resume updated
LinkedIn updated
GitHub polished
All links working
Proofread

SUMMARY
Total Tickets: 70+
By Phase:
Phase 2 (Venues & Events): 11 tickets
Phase 3 (Booking): 7 tickets
Phase 4 (Docker, Redis, Payments): 15 tickets
Phase 5 (Kubernetes & AWS): 14 tickets
Phase 6 (CI/CD, Testing, Docs): 17 tickets
Critical Path:
TH-201 → TH-205 → TH-301 → TH-303 → TH-405 → TH-512 → TH-601 → TH-610
Key Interview Stories:
Distributed Locking (TH-303, TH-404, TH-405, TH-610)
Payment Integration (TH-407-TH-411)
Infrastructure as Code (TH-507-TH-514)
CI/CD Pipeline (TH-601-TH-605)
Load Testing & Chaos Engineering (TH-609-TH-612)
Ready to Start?
Begin with TH-201: Create Venue Entity & Repository


