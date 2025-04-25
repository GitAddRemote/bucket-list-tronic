dataSource {
  pooled = true
  jmxExport = true
  driverClassName = System.getenv("DB_DRIVER") ?: "org.postgresql.Driver"
  username = System.getenv("POSTGRES_USER") ?: "defaultuser"
  password = System.getenv("POSTGRES_PASSWORD") ?: "defaultpass"
}

hibernate {
  cache.use_second_level_cache = true
  cache.use_query_cache = false
  cache.region.factory_class = 'org.hibernate.cache.ehcache.SingletonEhCacheRegionFactory'
  singleSession = true
  flush.mode = 'manual'
}

environments {
  development {
    dataSource {
      dbCreate = ""
      url = "jdbc:postgresql://localhost:5432/${System.getenv("POSTGRES_DB") ?: "devdb"}"
    }
  }
  test {
    dataSource {
      dbCreate = ""
      url = "jdbc:postgresql://${System.getenv("POSTGRES_HOST") ?: "localhost"}:5432/${System.getenv("POSTGRES_DB") ?: "testdb"}"
    }
  }
  production {
    dataSource {
      dbCreate = ""
      url = "jdbc:postgresql://${System.getenv("POSTGRES_HOST") ?: "localhost"}:5432/${System.getenv("POSTGRES_DB") ?: "proddb"}"
      properties {
        jmxEnabled = true
        initialSize = 5
        maxActive = 50
        minIdle = 5
        maxIdle = 25
        maxWait = 10000
        maxAge = 10 * 60000
        timeBetweenEvictionRunsMillis = 5000
        minEvictableIdleTimeMillis = 60000
        validationQuery = "SELECT 1"
        validationQueryTimeout = 3
        validationInterval = 15000
        testOnBorrow = true
        testWhileIdle = true
        testOnReturn = false
        jdbcInterceptors = "ConnectionState"
        defaultTransactionIsolation = java.sql.Connection.TRANSACTION_READ_COMMITTED
      }
    }
  }
}
