package dev.niekirk.com.instagram4android.requests;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import dev.niekirk.com.instagram4android.requests.payload.InstagramGetStoryViewersResult;

/**
 *
 * {@link InstagramGetRequest} class to get story viewers of a certain story id
 *
 * @author Daniele Pancottini
 * @ported by Vioxini
 *
 */

@AllArgsConstructor
public class InstagramGetStoryViewersRequest extends InstagramGetRequest<InstagramGetStoryViewersResult> {

    private String storyPk;

    @Override
    public String getUrl(){
        return "media/" + storyPk + "/list_reel_media_viewer/";
    }

    @Override
    @SneakyThrows
    public InstagramGetStoryViewersResult parseResult(int statusCode, String content){

        return parseJson(statusCode, content, InstagramGetStoryViewersResult.class);

    }

}