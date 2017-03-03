package org.gkh.repository;

import org.gkh.model.EdisonData;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author aleksandrpliskin on 03.03.17.
 */
public interface EdisonDataRepository extends MongoRepository<EdisonData, String> {
}
