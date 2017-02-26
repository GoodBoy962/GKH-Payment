package org.gkh.repository;

import org.gkh.model.Account;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author aleksandrpliskin on 26.02.17.
 */
public interface AccountRepository extends MongoRepository<Account, String> {

    Account findByLogin(String login);

}
