package android.marshi.wave.repository.feedly;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * Copyright: marshi
 */
@Getter
@Setter
@ToString
public class FeedDto {

	private String title;
	private String description;
	private String website;
	private String visualUrl;
	private List<String> topics;

}
