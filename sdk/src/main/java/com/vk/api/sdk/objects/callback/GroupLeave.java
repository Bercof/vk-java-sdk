// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.callback;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.base.BoolInt;
import java.util.Objects;

/**
 * GroupLeave object
 */
public class GroupLeave implements Validable {
    @SerializedName("self")
    private BoolInt self;

    /**
     * Entity: owner
     */
    @SerializedName("user_id")
    private Long userId;

    public boolean isSelf() {
        return self == BoolInt.YES;
    }

    public BoolInt getSelf() {
        return self;
    }

    public Long getUserId() {
        return userId;
    }

    public GroupLeave setUserId(Long userId) {
        this.userId = userId;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(self, userId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GroupLeave groupLeave = (GroupLeave) o;
        return Objects.equals(userId, groupLeave.userId) &&
                Objects.equals(self, groupLeave.self);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("GroupLeave{");
        sb.append("userId=").append(userId);
        sb.append(", self=").append(self);
        sb.append('}');
        return sb.toString();
    }
}
