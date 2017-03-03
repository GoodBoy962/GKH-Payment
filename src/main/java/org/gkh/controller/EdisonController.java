package org.gkh.controller;

import org.gkh.model.EdisonData;
import org.gkh.repository.EdisonDataRepository;
import org.gkh.util.ApiUrls;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author aleksandrpliskin on 03.03.17.
 */
@RestController
public class EdisonController {

    @Autowired
    private EdisonDataRepository repository;

    @GetMapping(value = ApiUrls.BASE_API_URL + "/edison")
    @ResponseStatus(HttpStatus.OK)
    public void getData(@RequestParam(name = "data") Long data, HttpServletRequest request) {
        String edisonHost = request.getRemoteHost();
        repository.save(new EdisonData(data, edisonHost));
    }

}
