package io.quicktype;

import java.util.Map;
import com.fasterxml.jackson.annotation.*;

public class Commit {
    private String sha;
    private Author author;
    private String message;
    private boolean distinct;
    private String url;

    @JsonProperty("sha")
    public String getSha() { return sha; }
    @JsonProperty("sha")
    public void setSha(String value) { this.sha = value; }

    @JsonProperty("author")
    public Author getAuthor() { return author; }
    @JsonProperty("author")
    public void setAuthor(Author value) { this.author = value; }

    @JsonProperty("message")
    public String getMessage() { return message; }
    @JsonProperty("message")
    public void setMessage(String value) { this.message = value; }

    @JsonProperty("distinct")
    public boolean getDistinct() { return distinct; }
    @JsonProperty("distinct")
    public void setDistinct(boolean value) { this.distinct = value; }

    @JsonProperty("url")
    public String getUrl() { return url; }
    @JsonProperty("url")
    public void setUrl(String value) { this.url = value; }
}