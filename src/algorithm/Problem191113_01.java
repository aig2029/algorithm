package algorithm;

public class Problem191113_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public String solution(String m, String[] musicinfos) {
		String answer = "";
		m = convertNote(m);
		Song song = new Song("(None)", 0);

		for (int i = 0; i < musicinfos.length; i++) {
			String[] split = musicinfos[i].split(",");

			// split[2] -> 곡제목, split[3] -> 악보정보

			String[] hm1 = split[0].split(":");
			String[] hm2 = split[1].split(":");
			int playtime = 60 * (Integer.parseInt(hm2[0]) - Integer.parseInt(hm1[0]))
					+ (Integer.parseInt(hm2[1]) - Integer.parseInt(hm1[1]));

			playtime = Math.abs(playtime);

			split[3] = convertNote(split[3]);

			int remaintime = playtime;
			StringBuilder sb = new StringBuilder();
			while (remaintime > 0) {
				if (remaintime >= split[3].length()) {
					sb.append(split[3]);
					remaintime -= split[3].length();
				} else {
					for (int k = 0; k < remaintime; k++) {
						sb.append(split[3].substring(0, remaintime));
						remaintime = 0;
					}
				}
			}
			// System.out.println("실제 플레이된 악보 "+sb.toString());

			if (sb.toString().contains(m)) {

				if (playtime > song.playtime)
					song = new Song(split[2], playtime);

			}

		}

		return song.songName;

	}

	class Song {
		String songName;
		int playtime;

		Song(String songName, int playtime) {
			this.songName = songName;
			this.playtime = playtime;
		}
	}

	static String convertNote(String note) {
		note = note.replace("C#", "2");
		note = note.replace("D#", "4");
		note = note.replace("F#", "7");
		note = note.replace("G#", "9");
		note = note.replace("A#", "z");

		note = note.replace("C", "1");

		note = note.replace("D", "3");

		note = note.replace("E", "5");
		note = note.replace("F", "6");

		note = note.replace("G", "8");

		note = note.replace("A", "0");

		note = note.replace("B", "x");

		return note;
	}

	
}
