# Makefile for Docker Compose + Grails application workflow
# -----------------------------------------------------
# ENV_FILE: choose environment variables file (.env.dev, .env.prod, etc.)
ENV_FILE ?= .env.dev

.PHONY: up down logs build restart ps shell migrate run

# ----------------------------------------------
# Docker Compose targets
# ----------------------------------------------

# Start services in detached mode
up:
	docker-compose --env-file $(ENV_FILE) up -d

# Stop all services
down:
	docker-compose --env-file $(ENV_FILE) down

# Stream logs from all services
logs:
	docker-compose --env-file $(ENV_FILE) logs -f

# Build or rebuild Docker images
build:
	docker-compose --env-file $(ENV_FILE) build

# Restart services (down then up)
restart: down up

# List running services
ps:
	docker-compose --env-file $(ENV_FILE) ps

# Open an interactive shell in a specified service container
# Usage: make shell service=<service_name>
shell:
	docker-compose --env-file $(ENV_FILE) exec $(service) sh

# ----------------------------------------------
# Grails Database Migration
# ----------------------------------------------

# Apply any pending Liquibase/GORM migrations (idempotent)
migrate:
	@echo "⏳  Running database migrations..."
	grails dbm-update

# ----------------------------------------------
# Grails Application
# ----------------------------------------------

# Start Docker services, run migrations, then launch the Grails app
run: up migrate
	@echo "🚀  Starting Grails application..."
	grails run-app

