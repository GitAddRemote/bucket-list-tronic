# 🌍✈️ BUCKET LIST TRONIC — Explore the World, One Dream at a Time

![CI](https://github.com/GitAddRemote/bucket-list-tronic/actions/workflows/ci.yml/badge.svg)

> 🧩 This project uses **Grails 2.5.6** and **Groovy 2.4.21** — maintained for legacy platform compatibility.  
> ⚠️ This project is not actively maintained and is intended for educational and demo purposes only.  
> ℹ️ This repo uses [.editorconfig](https://editorconfig.org) to maintain consistent formatting across editors and IDEs.

Welcome to **BucketListTronic**, a legacy-modern hybrid Grails 2.5 web app that helps users track, explore, and celebrate their dream destinations — while showing off real-world engineering skills like interactive mapping, geolocation, asynchronous messaging, and secure RESTful backend design.

---

## ✨ Features

✅ Secure login system with Spring Security  
✅ Create and manage bucket list locations and points of interest  
✅ Add journals, planning notes, tags, and photos for each location  
✅ See your destinations on an interactive Leaflet.js world map  
✅ Use the map to filter your visible list dynamically  
✅ Click a list item to zoom in and focus the map  
✅ Mark locations as visited and track progress  
✅ Social features: friends list, @mentions, activity feed  
✅ File uploads: Avatar + travel photos (via S3/Minio)  
✅ Background enrichment service (Wikipedia + Weather) via RabbitMQ  
✅ Debounced AJAX search  
✅ Public or private sharing of locations  
✅ Admin dashboard + metrics + feature flag control  
✅ Gamification, reminders, leaderboards & more

---

## ⚙️ Tech Stack

| Layer           | Tech Used                                        |
|-----------------|--------------------------------------------------|
| Backend         | Grails 2.5.6, Groovy **2.4.21**, Spring Security |
| Frontend Views  | GSP (Groovy Server Pages), jQuery, Leaflet.js    |
| Database        | PostgreSQL (Dockerized)                          |
| Messaging Queue | RabbitMQ                                         |
| Enrichment API  | Wikipedia, OpenWeather, PositionStack            |
| File Storage    | Minio (local), AWS S3 (production)               |
| Auth            | Spring Security Core plugin                      |
| Dev Tools       | SDKMAN, Docker Compose                           |

---

## 🛠️ Getting Started

### 🚀 Prerequisites

- Java 8 (Zulu preferred)
- Grails 2.5.6 (patched to use Groovy 2.4.21)
- Docker & Docker Compose
- SDKMAN (recommended)

---

### 🧪 Local Setup

```bash
git clone https://github.com/GitAddRemote/bucket-list-tronic.git
cd bucket-list-tronic
sdk env install  # installs Java 8, Grails 2.5.6, Groovy 2.4
cp .env.template .env.dev  # create your environment file
docker-compose --env-file .env.dev up -d  # start PostgreSQL, RabbitMQ, Minio

grails run-app
```

---

## ⚡ Environment Configuration

This project uses `.env` files to configure services like PostgreSQL, RabbitMQ, and Minio.

To get started:

```bash
cp .env.template .env.dev
cp .env.template .env.test
cp .env.template .env.prod
```

Then edit each file and set appropriate values.

Environment variables include:

- `POSTGRES_USER`
- `POSTGRES_PASSWORD`
- `POSTGRES_DB`
- `RABBITMQ_DEFAULT_USER`
- `RABBITMQ_DEFAULT_PASS`
- `MINIO_ROOT_USER`
- `MINIO_ROOT_PASSWORD`

⚠️ **Never commit your real `.env.*` files to Git.**

---

## 🏗️ Makefile Usage

This project includes a `Makefile` to simplify Docker Compose operations.

Examples:

| 🧪 Command                             | 🔍 Purpose                                      |
|---------------------------------------|------------------------------------------------|
| `make up`                             | 🚀 Start services using `.env.dev` (default)   |
| `make up ENV_FILE=.env.prod`          | 🔐 Start services using production env vars    |
| `make down`                           | 🛑 Stop services                                |
| `make restart`                        | 🔄 Restart services                             |
| `make logs`                           | 📜 View live container logs                     |
| `make ps`                             | 🧩 List running containers                      |
| `make shell service=postgres`        | 🐚 Open a shell inside a running service        |

If you don't specify `ENV_FILE`, it defaults to `.env.dev`.

---
