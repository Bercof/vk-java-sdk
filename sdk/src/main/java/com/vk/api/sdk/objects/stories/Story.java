// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.stories;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import com.vk.api.sdk.objects.base.BoolInt;
import com.vk.api.sdk.objects.photos.Photo;
import com.vk.api.sdk.objects.video.VideoFull;
import java.util.Objects;

/**
 * Story object
 */
public class Story implements Validable {
    /**
     * Access key for private object.
     */
    @SerializedName("access_key")
    private String accessKey;

    /**
     * Information whether story has question sticker and current user can send question to the author
     */
    @SerializedName("can_ask")
    private BoolInt canAsk;

    /**
     * Information whether story has question sticker and current user can send anonymous question to the author
     */
    @SerializedName("can_ask_anonymous")
    private BoolInt canAskAnonymous;

    /**
     * Information whether current user can comment the story (0 - no, 1 - yes).
     */
    @SerializedName("can_comment")
    private BoolInt canComment;

    /**
     * Information whether current user can hide the story (0 - no, 1 - yes).
     */
    @SerializedName("can_hide")
    private BoolInt canHide;

    /**
     * Information whether current user can like the story.
     */
    @SerializedName("can_like")
    private Boolean canLike;

    /**
     * Information whether current user can reply to the story (0 - no, 1 - yes).
     */
    @SerializedName("can_reply")
    private BoolInt canReply;

    /**
     * Information whether current user can see the story (0 - no, 1 - yes).
     */
    @SerializedName("can_see")
    private BoolInt canSee;

    /**
     * Information whether current user can share the story (0 - no, 1 - yes).
     */
    @SerializedName("can_share")
    private BoolInt canShare;

    @SerializedName("can_use_in_narrative")
    private Boolean canUseInNarrative;

    @SerializedName("clickable_stickers")
    private ClickableStickers clickableStickers;

    /**
     * Date when story has been added in Unixtime.
     */
    @SerializedName("date")
    private Integer date;

    /**
     * Story expiration time. Unixtime.
     */
    @SerializedName("expires_at")
    private Integer expiresAt;

    @SerializedName("first_narrative_title")
    private String firstNarrativeTitle;

    /**
     * Story ID.
     */
    @SerializedName("id")
    @Required
    private Integer id;

    /**
     * Information whether the story is deleted (false - no, true - yes).
     */
    @SerializedName("is_deleted")
    private Boolean isDeleted;

    /**
     * Information whether the story is expired (false - no, true - yes).
     */
    @SerializedName("is_expired")
    private Boolean isExpired;

    @SerializedName("link")
    private StoryLink link;

    @SerializedName("narratives_count")
    private Integer narrativesCount;

    /**
     * Story owner's ID.
     * Entity: owner
     */
    @SerializedName("owner_id")
    @Required
    private Long ownerId;

    @SerializedName("parent_story")
    private Story parentStory;

    /**
     * Access key for private object.
     */
    @SerializedName("parent_story_access_key")
    private String parentStoryAccessKey;

    /**
     * Parent story ID.
     */
    @SerializedName("parent_story_id")
    private Integer parentStoryId;

    /**
     * Parent story owner's ID.
     */
    @SerializedName("parent_story_owner_id")
    private Integer parentStoryOwnerId;

    @SerializedName("photo")
    private Photo photo;

    /**
     * Replies counters to current story.
     */
    @SerializedName("replies")
    private Replies replies;

    /**
     * Information whether current user has seen the story or not (0 - no, 1 - yes).
     */
    @SerializedName("seen")
    private BoolInt seen;

    @SerializedName("type")
    private StoryType type;

    @SerializedName("video")
    private VideoFull video;

    /**
     * Views number.
     */
    @SerializedName("views")
    private Integer views;

    public String getAccessKey() {
        return accessKey;
    }

    public Story setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }

    public boolean canAsk() {
        return canAsk == BoolInt.YES;
    }

    public BoolInt getCanAsk() {
        return canAsk;
    }

    public boolean canAskAnonymous() {
        return canAskAnonymous == BoolInt.YES;
    }

    public BoolInt getCanAskAnonymous() {
        return canAskAnonymous;
    }

    public boolean canComment() {
        return canComment == BoolInt.YES;
    }

    public BoolInt getCanComment() {
        return canComment;
    }

    public boolean canHide() {
        return canHide == BoolInt.YES;
    }

    public BoolInt getCanHide() {
        return canHide;
    }

    public Boolean getCanLike() {
        return canLike;
    }

    public Story setCanLike(Boolean canLike) {
        this.canLike = canLike;
        return this;
    }

    public boolean canReply() {
        return canReply == BoolInt.YES;
    }

    public BoolInt getCanReply() {
        return canReply;
    }

    public boolean canSee() {
        return canSee == BoolInt.YES;
    }

    public BoolInt getCanSee() {
        return canSee;
    }

    public boolean canShare() {
        return canShare == BoolInt.YES;
    }

    public BoolInt getCanShare() {
        return canShare;
    }

    public Boolean getCanUseInNarrative() {
        return canUseInNarrative;
    }

    public Story setCanUseInNarrative(Boolean canUseInNarrative) {
        this.canUseInNarrative = canUseInNarrative;
        return this;
    }

    public ClickableStickers getClickableStickers() {
        return clickableStickers;
    }

    public Story setClickableStickers(ClickableStickers clickableStickers) {
        this.clickableStickers = clickableStickers;
        return this;
    }

    public Integer getDate() {
        return date;
    }

    public Story setDate(Integer date) {
        this.date = date;
        return this;
    }

    public Integer getExpiresAt() {
        return expiresAt;
    }

    public Story setExpiresAt(Integer expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }

    public String getFirstNarrativeTitle() {
        return firstNarrativeTitle;
    }

    public Story setFirstNarrativeTitle(String firstNarrativeTitle) {
        this.firstNarrativeTitle = firstNarrativeTitle;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public Story setId(Integer id) {
        this.id = id;
        return this;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public Story setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
        return this;
    }

    public Boolean getIsExpired() {
        return isExpired;
    }

    public Story setIsExpired(Boolean isExpired) {
        this.isExpired = isExpired;
        return this;
    }

    public StoryLink getLink() {
        return link;
    }

    public Story setLink(StoryLink link) {
        this.link = link;
        return this;
    }

    public Integer getNarrativesCount() {
        return narrativesCount;
    }

    public Story setNarrativesCount(Integer narrativesCount) {
        this.narrativesCount = narrativesCount;
        return this;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public Story setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    public Story getParentStory() {
        return parentStory;
    }

    public Story setParentStory(Story parentStory) {
        this.parentStory = parentStory;
        return this;
    }

    public String getParentStoryAccessKey() {
        return parentStoryAccessKey;
    }

    public Story setParentStoryAccessKey(String parentStoryAccessKey) {
        this.parentStoryAccessKey = parentStoryAccessKey;
        return this;
    }

    public Integer getParentStoryId() {
        return parentStoryId;
    }

    public Story setParentStoryId(Integer parentStoryId) {
        this.parentStoryId = parentStoryId;
        return this;
    }

    public Integer getParentStoryOwnerId() {
        return parentStoryOwnerId;
    }

    public Story setParentStoryOwnerId(Integer parentStoryOwnerId) {
        this.parentStoryOwnerId = parentStoryOwnerId;
        return this;
    }

    public Photo getPhoto() {
        return photo;
    }

    public Story setPhoto(Photo photo) {
        this.photo = photo;
        return this;
    }

    public Replies getReplies() {
        return replies;
    }

    public Story setReplies(Replies replies) {
        this.replies = replies;
        return this;
    }

    public boolean isSeen() {
        return seen == BoolInt.YES;
    }

    public BoolInt getSeen() {
        return seen;
    }

    public StoryType getType() {
        return type;
    }

    public Story setType(StoryType type) {
        this.type = type;
        return this;
    }

    public VideoFull getVideo() {
        return video;
    }

    public Story setVideo(VideoFull video) {
        this.video = video;
        return this;
    }

    public Integer getViews() {
        return views;
    }

    public Story setViews(Integer views) {
        this.views = views;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, canReply, canLike, link, narrativesCount, video, ownerId, type, canHide, seen, isDeleted, canUseInNarrative, canSee, canComment, id, views, parentStoryAccessKey, canAskAnonymous, clickableStickers, canShare, photo, parentStoryId, expiresAt, firstNarrativeTitle, canAsk, parentStory, replies, accessKey, parentStoryOwnerId, isExpired);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Story story = (Story) o;
        return Objects.equals(date, story.date) &&
                Objects.equals(canAsk, story.canAsk) &&
                Objects.equals(ownerId, story.ownerId) &&
                Objects.equals(link, story.link) &&
                Objects.equals(video, story.video) &&
                Objects.equals(type, story.type) &&
                Objects.equals(seen, story.seen) &&
                Objects.equals(clickableStickers, story.clickableStickers) &&
                Objects.equals(parentStoryId, story.parentStoryId) &&
                Objects.equals(canAskAnonymous, story.canAskAnonymous) &&
                Objects.equals(canComment, story.canComment) &&
                Objects.equals(expiresAt, story.expiresAt) &&
                Objects.equals(isDeleted, story.isDeleted) &&
                Objects.equals(canLike, story.canLike) &&
                Objects.equals(firstNarrativeTitle, story.firstNarrativeTitle) &&
                Objects.equals(id, story.id) &&
                Objects.equals(narrativesCount, story.narrativesCount) &&
                Objects.equals(views, story.views) &&
                Objects.equals(canHide, story.canHide) &&
                Objects.equals(canShare, story.canShare) &&
                Objects.equals(photo, story.photo) &&
                Objects.equals(parentStoryAccessKey, story.parentStoryAccessKey) &&
                Objects.equals(canSee, story.canSee) &&
                Objects.equals(canUseInNarrative, story.canUseInNarrative) &&
                Objects.equals(parentStory, story.parentStory) &&
                Objects.equals(parentStoryOwnerId, story.parentStoryOwnerId) &&
                Objects.equals(canReply, story.canReply) &&
                Objects.equals(isExpired, story.isExpired) &&
                Objects.equals(replies, story.replies) &&
                Objects.equals(accessKey, story.accessKey);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("Story{");
        sb.append("date=").append(date);
        sb.append(", canAsk=").append(canAsk);
        sb.append(", ownerId=").append(ownerId);
        sb.append(", link=").append(link);
        sb.append(", video=").append(video);
        sb.append(", type=").append(type);
        sb.append(", seen=").append(seen);
        sb.append(", clickableStickers=").append(clickableStickers);
        sb.append(", parentStoryId=").append(parentStoryId);
        sb.append(", canAskAnonymous=").append(canAskAnonymous);
        sb.append(", canComment=").append(canComment);
        sb.append(", expiresAt=").append(expiresAt);
        sb.append(", isDeleted=").append(isDeleted);
        sb.append(", canLike=").append(canLike);
        sb.append(", firstNarrativeTitle='").append(firstNarrativeTitle).append("'");
        sb.append(", id=").append(id);
        sb.append(", narrativesCount=").append(narrativesCount);
        sb.append(", views=").append(views);
        sb.append(", canHide=").append(canHide);
        sb.append(", canShare=").append(canShare);
        sb.append(", photo=").append(photo);
        sb.append(", parentStoryAccessKey='").append(parentStoryAccessKey).append("'");
        sb.append(", canSee=").append(canSee);
        sb.append(", canUseInNarrative=").append(canUseInNarrative);
        sb.append(", parentStory=").append(parentStory);
        sb.append(", parentStoryOwnerId=").append(parentStoryOwnerId);
        sb.append(", canReply=").append(canReply);
        sb.append(", isExpired=").append(isExpired);
        sb.append(", replies=").append(replies);
        sb.append(", accessKey='").append(accessKey).append("'");
        sb.append('}');
        return sb.toString();
    }
}
