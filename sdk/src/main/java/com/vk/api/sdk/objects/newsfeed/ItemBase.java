// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.newsfeed;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.Objects;

/**
 * ItemBase object
 */
public class ItemBase implements Validable {
    /**
     * Date when item has been added in Unixtime
     */
    @SerializedName("date")
    @Required
    private Integer date;

    @SerializedName("feedback")
    private ItemWallpostFeedback feedback;

    /**
     * Preview length control parameter
     */
    @SerializedName("short_text_rate")
    private Number shortTextRate;

    /**
     * Item source ID
     * Entity: owner
     */
    @SerializedName("source_id")
    @Required
    private Long sourceId;

    @SerializedName("type")
    @Required
    private NewsfeedItemType type;

    public Integer getDate() {
        return date;
    }

    public ItemBase setDate(Integer date) {
        this.date = date;
        return this;
    }

    public ItemWallpostFeedback getFeedback() {
        return feedback;
    }

    public ItemBase setFeedback(ItemWallpostFeedback feedback) {
        this.feedback = feedback;
        return this;
    }

    public Number getShortTextRate() {
        return shortTextRate;
    }

    public ItemBase setShortTextRate(Number shortTextRate) {
        this.shortTextRate = shortTextRate;
        return this;
    }

    public Long getSourceId() {
        return sourceId;
    }

    public ItemBase setSourceId(Long sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    public NewsfeedItemType getType() {
        return type;
    }

    public ItemBase setType(NewsfeedItemType type) {
        this.type = type;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, feedback, sourceId, shortTextRate, type);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemBase itemBase = (ItemBase) o;
        return Objects.equals(date, itemBase.date) &&
                Objects.equals(feedback, itemBase.feedback) &&
                Objects.equals(shortTextRate, itemBase.shortTextRate) &&
                Objects.equals(sourceId, itemBase.sourceId) &&
                Objects.equals(type, itemBase.type);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("ItemBase{");
        sb.append("date=").append(date);
        sb.append(", feedback=").append(feedback);
        sb.append(", shortTextRate=").append(shortTextRate);
        sb.append(", sourceId=").append(sourceId);
        sb.append(", type=").append(type);
        sb.append('}');
        return sb.toString();
    }
}
