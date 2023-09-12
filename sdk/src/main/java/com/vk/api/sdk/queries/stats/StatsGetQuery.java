// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.queries.stats;

import com.vk.api.sdk.client.AbstractQueryBuilder;
import com.vk.api.sdk.client.Utils;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.objects.annotations.ApiParam;
import com.vk.api.sdk.objects.stats.GetInterval;
import com.vk.api.sdk.objects.stats.responses.GetResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Query for Stats.get method
 */
public class StatsGetQuery extends AbstractQueryBuilder<StatsGetQuery, List<GetResponse>> {
    /**
     * Creates a AbstractQueryBuilder instance that can be used to build user api request with various parameters
     *
     * @param client VK API client
     * @param actor actor with access token
     */
    public StatsGetQuery(VkApiClient client, UserActor actor) {
        super(client, "stats.get", Utils.buildParametrizedType(List.class, GetResponse.class));
        accessToken(actor.getAccessToken());
    }

    /**
     * Community ID.
     *
     * @param value value of "group id" parameter. Minimum is 0. Entity - owner
     *
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("group_id")
    public StatsGetQuery groupId(Long value) {
        return unsafeParam("group_id", value);
    }

    /**
     * Application ID.
     *
     * @param value value of "app id" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("app_id")
    public StatsGetQuery appId(Integer value) {
        return unsafeParam("app_id", value);
    }

    /**
     * Set timestamp from
     *
     * @param value value of "timestamp from" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("timestamp_from")
    public StatsGetQuery timestampFrom(Integer value) {
        return unsafeParam("timestamp_from", value);
    }

    /**
     * Set timestamp to
     *
     * @param value value of "timestamp to" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("timestamp_to")
    public StatsGetQuery timestampTo(Integer value) {
        return unsafeParam("timestamp_to", value);
    }

    /**
     * Set interval
     *
     * @param value value of "interval" parameter. By default day.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("interval")
    public StatsGetQuery interval(GetInterval value) {
        return unsafeParam("interval", value);
    }

    /**
     * Set intervals count
     *
     * @param value value of "intervals count" parameter. Minimum is 0.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("intervals_count")
    public StatsGetQuery intervalsCount(Integer value) {
        return unsafeParam("intervals_count", value);
    }

    /**
     * Set extended
     *
     * @param value value of "extended" parameter. By default true.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("extended")
    public StatsGetQuery extended(Boolean value) {
        return unsafeParam("extended", value);
    }

    /**
     * filters
     * Set filters
     *
     * @param value value of "filters" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("filters")
    public StatsGetQuery filters(String... value) {
        return unsafeParam("filters", value);
    }

    /**
     * Set filters
     *
     * @param value value of "filters" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("filters")
    public StatsGetQuery filters(List<String> value) {
        return unsafeParam("filters", value);
    }

    /**
     * statsGroups
     * Set stats groups
     *
     * @param value value of "stats groups" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("stats_groups")
    public StatsGetQuery statsGroups(String... value) {
        return unsafeParam("stats_groups", value);
    }

    /**
     * Set stats groups
     *
     * @param value value of "stats groups" parameter.
     * @return a reference to this {@code AbstractQueryBuilder} object to fulfill the "Builder" pattern.
     */
    @ApiParam("stats_groups")
    public StatsGetQuery statsGroups(List<String> value) {
        return unsafeParam("stats_groups", value);
    }

    @Override
    protected StatsGetQuery getThis() {
        return this;
    }

    @Override
    protected List<String> essentialKeys() {
        return Arrays.asList("access_token");
    }
}
