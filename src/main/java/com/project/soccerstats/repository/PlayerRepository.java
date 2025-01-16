package com.project.soccerstats.repository;

import com.project.soccerstats.model.Player;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * PlayerRepository.java
 * This interface is responsible for providing CRUD (Create, Read, Update, Delete) operations for the Player entity.
 * It acts as a repository layer for accessing and managing Player data in MongoDB.
 */

@Repository
public interface PlayerRepository extends MongoRepository<Player, String> {
    // No additional methods are defined, but CRUD operations are inherited from MongoRepository. It is Parameterized with Player as the entity type and String as the ID type.
}
