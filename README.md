# 🌍✈️ BUCKETLISTTRONIC — Explore the World, One Dream at a Time

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

| Layer           | Tech Used                                      |
|-----------------|------------------------------------------------|
| Backend         | Grails 2.5.6, Groovy 2.4, Spring Security Core |
| Frontend Views  | GSP (Groovy Server Pages), jQuery, Leaflet.js  |
| Database        | PostgreSQL (Dockerized)                        |
| Messaging Queue | RabbitMQ                                       |
| Enrichment API  | Wikipedia, OpenWeather, PositionStack          |
| File Storage    | Minio (local), AWS S3 (production)             |
| Auth            | Spring Security Core plugin                    |
| Dev Tools       | SDKMAN, Docker Compose                         |

---

## 🛠️ Getting Started

### 🚀 Prerequisites

- Java 8 (Zulu preferred)
- Grails 2.5.6
- Docker & Docker Compose
- SDKMAN (recommended)

### 🧪 Local Setup

```bash
git clone https://github.com/your-username/bucketlisttronic.git
cd bucketlisttronic
sdk env install  # installs Java 8, Grails 2.5.6, Groovy 2.4
docker-compose up -d  # starts PostgreSQL + RabbitMQ

grails run-app
```

---

## 🗺️ Roadmap (Phased Development)

### ✅ Phase 1 — MVP  
- Auth, POI creation, interactive map, geocoding, visited toggle  
- Leaflet map + list filtering  
- PostgreSQL, RabbitMQ setup

### 🔄 Phase 2  
- Enrichment worker service  
- Journal + planning notes  
- File uploads (Minio + AWS S3 support)  
- Friend system + activity feed

### 🚀 Phase 3  
- Public sharing + analytics dashboard  
- Gamification + reminders  
- Admin backend + feature flags  
- Full map/list bi-directional interaction

---

## 👥 Contributing

This is a solo-maintained legacy showcase project — pull requests are welcome, especially if you're into old-school Grails or want to help modernize it!

---

## 📜 License

TBD — this project may be licensed under the MIT License or another permissive license in the future.

---

## 🙌 Acknowledgments

Thanks to:
- Grails community for making even legacy feel fun 🕊️
- Leaflet.js for killer mapping with no API key 💚
- Wikipedia & OpenWeather for open data
- You, for stopping by 🌟

---

_“Wherever there is light, there is also shadow. Wherever there are dreams, there is also adventure.”_
