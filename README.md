# 🌍✈️ BUCKETLISTTRONIC — Explore the World, One Dream at a Time

![CI](https://github.com/GitAddRemote/bucket-list-tronic/actions/workflows/ci.yml/badge.svg)
![Deploy](https://github.com/GitAddRemote/bucket-list-tronic/actions/workflows/deploy.yml/badge.svg)

> 🧩 This project uses **Grails 2.5.6** and **Groovy 2.4.21** — maintained for legacy platform compatibility. Future migration to Grails 5 or Spring Boot is under consideration.  
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

### 🧪 Local Setup

```bash
git clone https://github.com/GitAddRemote/bucket-list-tronic.git
cd bucket-list-tronic
sdk env install  # installs Java 8, Grails 2.5.6, Groovy 2.4
docker-compose up -d  # starts PostgreSQL + RabbitMQ

grails run-app
