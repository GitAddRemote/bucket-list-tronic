# Makefile for Docker Compose with environment support

ENV_FILE ?= .env.dev

up:
	docker-compose --env-file $(ENV_FILE) up -d

down:
	docker-compose --env-file $(ENV_FILE) down

logs:
	docker-compose --env-file $(ENV_FILE) logs -f

build:
	docker-compose --env-file $(ENV_FILE) build

restart: down up

ps:
	docker-compose --env-file $(ENV_FILE) ps

# Example: make shell service=postgres
shell:
	docker-compose --env-file $(ENV_FILE) exec $(service) sh
