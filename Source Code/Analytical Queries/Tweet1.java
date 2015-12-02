package com.umkc.ashok;

public class Tweet1 {


	
	user user1;
	
	  
 

		/*

		public entities getEnt1() {
			return ent1;
		}

		public void setEnt1(entities ent1) {
			this.ent1 = ent1;
		}

		entities ent1;
*/	    
	    String  created_at;
	   /* String id;
	    String id_str;
	    String text;
	    String source;
	    Boolean truncated;
	    String in_reply_to_status_id;
	    String in_reply_to_status_id_str;
	    String in_reply_to_user_id;
	    String in_reply_to_user_id_str;
	    String in_reply_to_screen_name;
	    String geo;
	    String coordinates;
	    String place;
	    String contributors;
	    String retweet_count;
	    String favorite_count;
	    Boolean favorited;
	    Boolean retweeted;
	    Boolean possibly_sensitive;
	    String filter_level;*/
	    String lang;
	    //String timestamp_ms;
	  

		public String getCreated_at() {
			return created_at;
		}

		 public void setCreated_at(String created_at) {
			this.created_at = created_at;
		}

		 /* public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getId_str() {
			return id_str;
		}

		public void setId_str(String id_str) {
			this.id_str = id_str;
		}

		public String getText() {
			return text;
		}

		public void setText(String text) {
			this.text = text;
		}

		public String getSource() {
			return source;
		}

		public void setSource(String source) {
			this.source = source;
		}

		public Boolean getTruncated() {
			return truncated;
		}

		public void setTruncated(Boolean truncated) {
			this.truncated = truncated;
		}

		public String getIn_reply_to_status_id() {
			return in_reply_to_status_id;
		}

		public void setIn_reply_to_status_id(String in_reply_to_status_id) {
			this.in_reply_to_status_id = in_reply_to_status_id;
		}

		public String getIn_reply_to_status_id_str() {
			return in_reply_to_status_id_str;
		}

		public void setIn_reply_to_status_id_str(String in_reply_to_status_id_str) {
			this.in_reply_to_status_id_str = in_reply_to_status_id_str;
		}

		public String getIn_reply_to_user_id() {
			return in_reply_to_user_id;
		}

		public void setIn_reply_to_user_id(String in_reply_to_user_id) {
			this.in_reply_to_user_id = in_reply_to_user_id;
		}

		public String getIn_reply_to_user_id_str() {
			return in_reply_to_user_id_str;
		}

		public void setIn_reply_to_user_id_str(String in_reply_to_user_id_str) {
			this.in_reply_to_user_id_str = in_reply_to_user_id_str;
		}

		public String getIn_reply_to_screen_name() {
			return in_reply_to_screen_name;
		}

		public void setIn_reply_to_screen_name(String in_reply_to_screen_name) {
			this.in_reply_to_screen_name = in_reply_to_screen_name;
		}

		public String getGeo() {
			return geo;
		}

		public void setGeo(String geo) {
			this.geo = geo;
		}

		public String getCoordinates() {
			return coordinates;
		}

		public void setCoordinates(String coordinates) {
			this.coordinates = coordinates;
		}

		public String getPlace() {
			return place;
		}

		public void setPlace(String place) {
			this.place = place;
		}

		public String getContributors() {
			return contributors;
		}

		public void setContributors(String contributors) {
			this.contributors = contributors;
		}

		public String getRetweet_count() {
			return retweet_count;
		}

		public void setRetweet_count(String retweet_count) {
			this.retweet_count = retweet_count;
		}

		public String getFavorite_count() {
			return favorite_count;
		}

		public void setFavorite_count(String favorite_count) {
			this.favorite_count = favorite_count;
		}

		public Boolean getFavorited() {
			return favorited;
		}

		public void setFavorited(Boolean favorited) {
			this.favorited = favorited;
		}

		public Boolean getRetweeted() {
			return retweeted;
		}

		public void setRetweeted(Boolean retweeted) {
			this.retweeted = retweeted;
		}

		public Boolean getPossibly_sensitive() {
			return possibly_sensitive;
		}

		public void setPossibly_sensitive(Boolean possibly_sensitive) {
			this.possibly_sensitive = possibly_sensitive;
		}

		public String getFilter_level() {
			return filter_level;
		}

		public void setFilter_level(String filter_level) {
			this.filter_level = filter_level;
		}*/

		public String getLang() {
			return lang;
		}

		public void setLang(String lang) {
			this.lang = lang;
		}

		/*public String getTimestamp_ms() {
			return timestamp_ms;
		}

		public void setTimestamp_ms(String timestamp_ms) {
			this.timestamp_ms = timestamp_ms;
		}*/
		
		 public user getUser1() {
				return user1;
			}

			public void setUser1(user user1) {
				this.user1 = user1;
			}
}
class user
{
	    String name; 
	    String screen_name; 
	    
	    public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getScreen_name() {
			return screen_name;
		}
		public void setScreen_name(String screen_name) {
			this.screen_name = screen_name;
		}
}
 