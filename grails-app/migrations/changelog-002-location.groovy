databaseChangeLog = {

	changeSet(author: "hezeqiah (generated)", id: "1746158527135-1") {
		createTable(tableName: "location") {
			column(name: "id", type: "int8") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "locationPK")
			}

			column(name: "version", type: "int8") {
				constraints(nullable: "false")
			}

			column(name: "description", type: "varchar(500)")

			column(name: "name", type: "varchar(100)") {
				constraints(nullable: "false")
			}

			column(name: "user_id", type: "int8") {
				constraints(nullable: "false")
			}

			column(name: "visited", type: "boolean") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "hezeqiah (generated)", id: "1746158527135-2") {
		modifyDataType(columnName: "account_expired", newDataType: "boolean", tableName: "app_user")
	}

	changeSet(author: "hezeqiah (generated)", id: "1746158527135-3") {
		modifyDataType(columnName: "account_locked", newDataType: "boolean", tableName: "app_user")
	}

	changeSet(author: "hezeqiah (generated)", id: "1746158527135-4") {
		modifyDataType(columnName: "enabled", newDataType: "boolean", tableName: "app_user")
	}

	changeSet(author: "hezeqiah (generated)", id: "1746158527135-5") {
		modifyDataType(columnName: "password_expired", newDataType: "boolean", tableName: "app_user")
	}

	changeSet(author: "hezeqiah (generated)", id: "1746158527135-6") {
		addForeignKeyConstraint(baseColumnNames: "user_id", baseTableName: "location", constraintName: "FK_e5jwd37ob25i4e7jwownmu08w", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "app_user", referencesUniqueColumn: "false")
	}
}
