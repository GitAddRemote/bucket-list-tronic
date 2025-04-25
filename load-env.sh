#!/usr/bin/env bash
# load-env.sh

# Load environment variables from .env.dev and pass all other args to Grails
if [ ! -f .env.dev ]; then
  echo "❌ .env.dev file not found!"
  exit 1
fi

echo "✅ Loading environment variables from .env.dev"
export $(grep -v '^#' .env.dev | xargs)

# Run Grails with any arguments passed to the script
echo "🚀 Running: grails $@"
grails "$@"
