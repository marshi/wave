package android.marshi.wave.domain;

import android.databinding.BindingAdapter;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
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

    @BindingAdapter("visualImage")
    public static void setVisualImage(ImageView v, String oldUrl, String newUrl) {
        if (!newUrl.equals(oldUrl)) {
            Glide.with(v.getContext()).load(newUrl).into(v);
        }
    }

}
