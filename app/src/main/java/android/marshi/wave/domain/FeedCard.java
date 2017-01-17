package android.marshi.wave.domain;

import lombok.AllArgsConstructor;

/**
 * Created by a13178 on 2017/01/10.
 */
@AllArgsConstructor
public class FeedCard {

    String title;

    String text;

    String imageUrl;

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
