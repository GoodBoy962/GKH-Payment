package org.gkh.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author aleksandrpliskin on 03.03.17.
 */
@Document(collection = "edison_data")
public class EdisonData {

    @Id
    private String id;
    private Long data;
    private String edisonUrl;

    public EdisonData() {
    }

    public EdisonData(Long data, String edisonUrl) {
        this.data = data;
        this.edisonUrl = edisonUrl;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getData() {
        return data;
    }

    public void setData(Long data) {
        this.data = data;
    }

    public String getEdisonUrl() {
        return edisonUrl;
    }

    public void setEdisonUrl(String edisonUrl) {
        this.edisonUrl = edisonUrl;
    }
}
