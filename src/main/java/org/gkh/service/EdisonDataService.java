package org.gkh.service;

import org.gkh.model.EdisonData;
import org.gkh.repository.EdisonDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Neil Alishev
 */
@Service
public class EdisonDataService {

    @Autowired
    EdisonDataRepository edisonDataRepository;

    public long getWatts() {
        return edisonDataRepository.findAll()
                .stream()
                .map(EdisonData::getData)
                .reduce((a, e) -> a + e).orElse(0L);
    }
}
