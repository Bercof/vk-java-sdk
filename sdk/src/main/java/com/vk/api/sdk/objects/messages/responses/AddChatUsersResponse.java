// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.objects.messages.responses;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.vk.api.sdk.objects.Validable;
import com.vk.api.sdk.objects.annotations.Required;
import java.util.List;
import java.util.Objects;

/**
 * AddChatUsersResponse object
 */
public class AddChatUsersResponse implements Validable {
    @SerializedName("failed_peer_ids")
    @Required
    private List<Long> failedPeerIds;

    @SerializedName("failed_phone_numbers")
    @Required
    private List<String> failedPhoneNumbers;

    @SerializedName("invitees")
    @Required
    private List<Long> invitees;

    public List<Long> getFailedPeerIds() {
        return failedPeerIds;
    }

    public AddChatUsersResponse setFailedPeerIds(List<Long> failedPeerIds) {
        this.failedPeerIds = failedPeerIds;
        return this;
    }

    public List<String> getFailedPhoneNumbers() {
        return failedPhoneNumbers;
    }

    public AddChatUsersResponse setFailedPhoneNumbers(List<String> failedPhoneNumbers) {
        this.failedPhoneNumbers = failedPhoneNumbers;
        return this;
    }

    public List<Long> getInvitees() {
        return invitees;
    }

    public AddChatUsersResponse setInvitees(List<Long> invitees) {
        this.invitees = invitees;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(invitees, failedPhoneNumbers, failedPeerIds);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddChatUsersResponse addChatUsersResponse = (AddChatUsersResponse) o;
        return Objects.equals(invitees, addChatUsersResponse.invitees) &&
                Objects.equals(failedPhoneNumbers, addChatUsersResponse.failedPhoneNumbers) &&
                Objects.equals(failedPeerIds, addChatUsersResponse.failedPeerIds);
    }

    @Override
    public String toString() {
        final Gson gson = new Gson();
        return gson.toJson(this);
    }

    public String toPrettyString() {
        final StringBuilder sb = new StringBuilder("AddChatUsersResponse{");
        sb.append("invitees=").append(invitees);
        sb.append(", failedPhoneNumbers='").append(failedPhoneNumbers).append("'");
        sb.append(", failedPeerIds=").append(failedPeerIds);
        sb.append('}');
        return sb.toString();
    }
}
