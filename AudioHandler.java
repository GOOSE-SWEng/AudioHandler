package media;


import java.util.ArrayList;

public class AudioHandler {
	private AudioList audios = new AudioList();
	
	public class AudioFile {
		private String url;
		private Boolean looping;
		private String id;
		
		public AudioFile(String url, Boolean looping, String id) {
			this.url = url;
			this.looping = looping;
			this.id = id;
			
		}
		
		public String getId() {
			return id;
		}
	}
	
	class AudioList extends ArrayList<AudioFile> {
		
		AudioList() {
			super();
		}
		public Boolean addAudioFile(AudioFile newFile) {
			
			for (int i = 1; i <= this.size(); i++) {
				if (newFile.getId() == this.get(i).getId()) {
					return false;
				}
			}
			
			this.add(newFile);
			return true;
		}
	}
	public Boolean registerAudio(String url, Boolean looping, String id) {
		return audios.addAudioFile(new AudioFile(url, looping, id));
	}
	
	public void startAudio(String id) {
		
	}
	
	public void stopAudio(String id) {
	
	}
	
	public void deregisterAudio(String id) {
		for (int i = 1; i <= audios.size(); i++) {
			if (id == audios.get(i).getId()) {
				audios.remove(i);
			}
		}
	}
}