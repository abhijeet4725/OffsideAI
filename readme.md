# OffsideAI

**OffsideAI** is a comprehensive, open-source conversational AI web application designed specifically for football enthusiasts. Built to serve as a domain-specific assistant, the platform provides intelligent insights, match predictions, transfer market analysis, and fantasy team guidance. OffsideAI leverages conversational AI to deliver a tailored experience, making it an essential tool for fans, fantasy players, and analysts alike.

---

### Key Features

- **Conversational AI**: Get smart, context-aware answers to a wide range of football-related questions.

- **Match Prediction**: Forecasts upcoming match results based on detailed analysis of team stats, form, and head-to-head records.

- **Transfer Analysis**: Aggregates transfer news and rumors, providing AI-driven analysis on potential impacts to teams and tactics.

- **Fantasy Team Helper**: Offers data-driven recommendations for fantasy football team selection, transfers, and captain choices.

- **User Authentication**: Secure login via JWT and Google OAuth 2.0.

- **Chat History**: Saves and manages user queries and responses.

- **Admin Panel**: A dedicated interface for moderation, analytics, and user support.


---

### Tech Stack

- **Backend**: Spring Boot (Java 21), JPA

- **AI**: Perplexity AI Premium API

- **Database**: PostgreSQL

- **Frontend**: React (with light/dark mode)

- **Authentication**: JWT & Google OAuth 2.0

- **Deployment**: Docker & Docker Compose

- **Data Sources**: Free/open football APIs


---

### Getting Started

To get a local copy of OffsideAI up and running, follow these simple steps.

#### Prerequisites

- Java Development Kit (JDK) 21 or higher

- Apache Maven

- Docker & Docker Compose

- A private Perplexity AI Premium API key


#### Installation

1. **Clone the repository**:

   You would use the standard `git clone` command to get the project files.

2. **Configure Environment**:

   You would need to set up your environment variables, including your Perplexity AI API key, in an `.env` file for Docker Compose.

3. **Build the Application**:

   Navigate to the project's root directory in your terminal and package the Spring Boot application using Maven. This command will compile the code and create a runnable JAR file.

   `mvn clean install`

4. **Run with Docker Compose**:

   After the build is successful, use Docker Compose to build the images and run the services (the application, PostgreSQL database, and Adminer).

   `docker compose up`

   This command will build the multi-stage Docker image for the application, create the containers, and link them together. The application will be accessible on `http://localhost:8080`.