# StockTradingPlatform

A full-stack stock market dashboard that displays real-time stock prices and interactive charts. Built with Java Spring Boot on the backend and a React/HTML frontend.

---

## Features

- **Real-time stock prices** — live market data fetched and served via REST API
- **Interactive charts** — visualize price history and market trends
- **Clean dashboard UI** — browse and track multiple stocks from one view

---

## Tech stack

| Layer | Tech |
|:---|:---|
| Backend | Java · Spring Boot · Spring Data JPA |
| Database | MySQL |
| Frontend | React / HTML · CSS · JavaScript |
| Data | Stock market API (<!-- add: Alpha Vantage / Yahoo Finance / whichever you used -->) |

---

## Architecture

```
Frontend (React/HTML)
      │
      ▼
Spring Boot REST API
      │
      ├── Stock price fetcher (external API)
      └── MySQL (persisted data)
```

---

## Getting started

### Prerequisites
- Java 17+
- Maven
- MySQL
- Node.js (if running frontend separately)

### Backend

```bash
git clone https://github.com/vikash1311/StockTradingPlatform.git
cd StockTradingPlatform

# Configure your DB and API key in:
# src/main/resources/application.properties

mvn spring-boot:run
```

### application.properties

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/stockdb
spring.datasource.username=root
spring.datasource.password=yourpassword

# Add your stock data API key here
STOCK_API_KEY=your_api_key
```

### Frontend

```bash
cd frontend   # or open index.html directly if plain HTML
npm install
npm run dev
```

---

## API endpoints

| Method | Endpoint | Description |
|:---|:---|:---|
| GET | `/api/stocks` | Get list of tracked stocks |
| GET | `/api/stocks/{symbol}` | Get current price for a symbol |
| GET | `/api/stocks/{symbol}/history` | Get price history for charts |

<!-- Add or remove endpoints based on what you actually built -->

---

## Author

**Vikash Gautam** · [LinkedIn](https://linkedin.com/in/vikash2808) · [Portfolio](https://vikash-gautam.netlify.app) · [Email](mailto:gautam7.ven@gmail.com)
