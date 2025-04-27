databaseChangeLog = {

	changeSet(author: "hezeqiah (generated)", id: "1745615449796-1") {
		createTable(tableName: "app_user") {
			column(name: "id", type: "int8") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "app_userPK")
			}

			column(name: "version", type: "int8") {
				constraints(nullable: "false")
			}

			column(name: "account_expired", type: "boolean") {
				constraints(nullable: "false")
			}

			column(name: "account_locked", type: "boolean") {
				constraints(nullable: "false")
			}

			column(name: "enabled", type: "boolean") {
				constraints(nullable: "false")
			}

			column(name: "password", type: "varchar(255)") {
				constraints(nullable: "false")
			}

			column(name: "password_expired", type: "boolean") {
				constraints(nullable: "false")
			}

			column(name: "username", type: "varchar(255)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "hezeqiah (generated)", id: "1745615449796-2") {
		createTable(tableName: "app_user_role") {
			column(name: "app_user_id", type: "int8") {
				constraints(nullable: "false")
			}

			column(name: "role_id", type: "int8") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "hezeqiah (generated)", id: "1745615449796-3") {
		createTable(tableName: "role") {
			column(name: "id", type: "int8") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "rolePK")
			}

			column(name: "version", type: "int8") {
				constraints(nullable: "false")
			}

			column(name: "authority", type: "varchar(255)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "hezeqiah (generated)", id: "1745615449796-4") {
		addPrimaryKey(columnNames: "app_user_id, role_id", constraintName: "app_user_rolePK", tableName: "app_user_role")
	}

	changeSet(author: "hezeqiah (generated)", id: "1745615449796-7") {
		createIndex(indexName: "username_uniq_1745615449763", tableName: "app_user", unique: "true") {
			column(name: "username")
		}
	}

	changeSet(author: "hezeqiah (generated)", id: "1745615449796-8") {
		createIndex(indexName: "authority_uniq_1745615449768", tableName: "role", unique: "true") {
			column(name: "authority")
		}
	}

	changeSet(author: "hezeqiah (generated)", id: "1745615449796-9") {
		createSequence(sequenceName: "hibernate_sequence")
	}

	changeSet(author: "hezeqiah (generated)", id: "1745615449796-5") {
		addForeignKeyConstraint(baseColumnNames: "app_user_id", baseTableName: "app_user_role", constraintName: "FK_q8322fca28vuy8ap93aprcjno", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "app_user", referencesUniqueColumn: "false")
	}

	changeSet(author: "hezeqiah (generated)", id: "1745615449796-6") {
		addForeignKeyConstraint(baseColumnNames: "role_id", baseTableName: "app_user_role", constraintName: "FK_2j333g1ur8pffgiqts1vmn1vr", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "role", referencesUniqueColumn: "false")
	}
}
