// Autogenerated from vk-api-schema. Please don't edit it manually.
package com.vk.api.sdk.actions;

import com.vk.api.sdk.client.AbstractAction;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.ServiceActor;
import com.vk.api.sdk.objects.annotations.ApiMethod;
import com.vk.api.sdk.objects.asr.ProcessModel;
import com.vk.api.sdk.queries.asr.AsrCheckStatusQuery;
import com.vk.api.sdk.queries.asr.AsrGetUploadUrlQuery;
import com.vk.api.sdk.queries.asr.AsrProcessQuery;

/**
 * List of Asr methods
 */
public class Asr extends AbstractAction {
    /**
     * Constructor
     *
     * @param client vk api client
     */
    public Asr(VkApiClient client) {
        super(client);
    }

    /**
     * Returns status of the task with provided `task_id`
     *
     * @param actor vk service actor
     * @param taskId ID of ASR task in UUID format.
     * @return query
     */
    @ApiMethod("asr.checkStatus")
    public AsrCheckStatusQuery checkStatus(ServiceActor actor, String taskId) {
        return new AsrCheckStatusQuery(getClient(), actor, taskId);
    }

    /**
     * Returns status of the task with provided `task_id`
     *
     * @param actor vk service actor
     * @return only actor query 
     */
    @ApiMethod("asr.checkStatus")
    public AsrCheckStatusQuery checkStatus(ServiceActor actor) {
        return new AsrCheckStatusQuery(getClient(), actor);
    }

    /**
     * Returns the server address to [vk.com/dev/upload_files_2|upload audio files].
     *
     * @param actor vk service actor
     * @return query
     */
    @ApiMethod("asr.getUploadUrl")
    public AsrGetUploadUrlQuery getUploadUrl(ServiceActor actor) {
        return new AsrGetUploadUrlQuery(getClient(), actor);
    }

    /**
     * Starts ASR task on [vk.com/dev/upload_files_2|uploaded audio file].
     *
     * @param actor vk service actor
     * @param audio This parameter is a JSON response returned from [vk.com/dev/upload_files_2|file uploading server].
     * @param model Which model to use for recognition. `neutral` -- general purpose (interviews, TV shows, etc.), `spontaneous` -- for NSFW audios (slang, profanity, etc.)
     * @return query
     */
    @ApiMethod("asr.process")
    public AsrProcessQuery process(ServiceActor actor, String audio, ProcessModel model) {
        return new AsrProcessQuery(getClient(), actor, audio, model);
    }

    /**
     * Starts ASR task on [vk.com/dev/upload_files_2|uploaded audio file].
     *
     * @param actor vk service actor
     * @return only actor query 
     */
    @ApiMethod("asr.process")
    public AsrProcessQuery process(ServiceActor actor) {
        return new AsrProcessQuery(getClient(), actor);
    }
}
