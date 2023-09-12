// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.board;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.base.BoolInt;
import java.util.Objects;

/**
 * Topic object
 */
public class Topic implements Validable {
    /**
     * Comments number
     */
    @SerializedName("comments")
    private Integer comments;

    /**
     * Date when the topic has been created in Unixtime
     */
    @SerializedName("created")
    private Integer created;

    /**
     * Creator ID
     * Entity: owner
     */
    @SerializedName("created_by")
    private Long createdBy;

    /**
     * First comment text
     */
    @SerializedName("first_comment")
    private String firstComment;

    /**
     * Topic ID
     */
    @SerializedName("id")
    private Integer id;

    /**
     * Information whether the topic is closed
     */
    @SerializedName("is_closed")
    private BoolInt isClosed;

    /**
     * Information whether the topic is fixed
     */
    @SerializedName("is_fixed")
    private BoolInt isFixed;

    /**
     * Last comment text
     */
    @SerializedName("last_comment")
    private String lastComment;

    /**
     * Topic title
     */
    @SerializedName("title")
    private String title;

    /**
     * Date when the topic has been updated in Unixtime
     */
    @SerializedName("updated")
    private Integer updated;

    /**
     * ID of user who updated the topic
     * Entity: owner
     */
    @SerializedName("updated_by")
    private Long updatedBy;

    public Integer getComments() {
        return comments;
    }

    public Topic setComments(Integer comments) {
        this.comments = comments;
        return this;
    }

    public Integer getCreated() {
        return created;
    }

    public Topic setCreated(Integer created) {
        this.created = created;
        return this;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public Topic setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public String getFirstComment() {
        return firstComment;
    }

    public Topic setFirstComment(String firstComment) {
        this.firstComment = firstComment;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public Topic setId(Integer id) {
        this.id = id;
        return this;
    }

    public boolean isClosed() {
        return isClosed == BoolInt.YES;
    }

    public BoolInt getIsClosed() {
        return isClosed;
    }

    public boolean isFixed() {
        return isFixed == BoolInt.YES;
    }

    public BoolInt getIsFixed() {
        return isFixed;
    }

    public String getLastComment() {
        return lastComment;
    }

    public Topic setLastComment(String lastComment) {
        this.lastComment = lastComment;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Topic setTitle(String title) {
        this.title = title;
        return this;
    }

    public Integer getUpdated() {
        return updated;
    }

    public Topic setUpdated(Integer updated) {
        this.updated = updated;
        return this;
    }

    public Long getUpdatedBy() {
        return updatedBy;
    }

    public Topic setUpdatedBy(Long updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstComment, comments, updatedBy, isClosed, createdBy, created, lastComment, id, title, isFixed, updated);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Topic topic = (Topic) o;
        return Objects.equals(comments, topic.comments) &&
                Objects.equals(created, topic.created) &&
                Objects.equals(updatedBy, topic.updatedBy) &&
                Objects.equals(lastComment, topic.lastComment) &&
                Objects.equals(id, topic.id) &&
                Objects.equals(isFixed, topic.isFixed) &&
                Objects.equals(title, topic.title) &&
                Objects.equals(createdBy, topic.createdBy) &&
                Objects.equals(updated, topic.updated) &&
                Objects.equals(firstComment, topic.firstComment) &&
                Objects.equals(isClosed, topic.isClosed);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("Topic{");
        sb.append("comments=").append(comments);
        sb.append(", created=").append(created);
        sb.append(", updatedBy=").append(updatedBy);
        sb.append(", lastComment='").append(lastComment).append("'");
        sb.append(", id=").append(id);
        sb.append(", isFixed=").append(isFixed);
        sb.append(", title='").append(title).append("'");
        sb.append(", createdBy=").append(createdBy);
        sb.append(", updated=").append(updated);
        sb.append(", firstComment='").append(firstComment).append("'");
        sb.append(", isClosed=").append(isClosed);
        sb.append('}');
        return sb.toString();
    }
}
