package bootcamp.persistence.migration;

import java.sql.Connection;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MigrationStrategy {

    private final Connection connection;

    private void executeMigration() {
        
    }
}
