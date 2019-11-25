package algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Problem191124_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm = new HashMap<>();
		if(hm.containsKey(1)) {
			System.out.println("포함");
		}
		else {
			System.out.println("안폼함");
		}
	}
	
	public int[] solution(String[] genres, int[] plays) {
        int[] answer;
        
        HashMap<String, Genre> hm = new HashMap<>();
        
        // 일단 들어 오는 곡들
        for(int i=0; i<genres.length; i++){
            System.out.println(genres[i]+" "+plays[i]);
        }
        System.out.println();
        
        for(int i=0; i<genres.length; i++){     
            if(!hm.containsKey(genres[i])){
                Genre now = new Genre(genres[i]);
                now.addSong(new Song(i, plays[i]));
                hm.put( genres[i], now );
                
                System.out.println(now);
                
                
            }
            else{
                Genre now = hm.get(genres[i]);
                now.addSong(new Song(i, plays[i]));
                hm.put( genres[i], now );
                
                System.out.println(now);         
            }
        }
        
        ArrayList<Genre> genreList = new ArrayList<>();
        
        for(String key : hm.keySet()){
            System.out.println(key);
            genreList.add(hm.get(key));
        }
        Collections.sort(genreList);
        System.out.println("=================");
        
        ArrayList<Integer> forAnswer = new ArrayList<>();
        
        int i=0;
        for(Genre genre : genreList){
            System.out.println(genre);
            if(genre.songList.size()>=2){
                forAnswer.add(genre.songList.get(0).songIndex);
                forAnswer.add(genre.songList.get(1).songIndex);
                i+=2;
            }
            else{
                forAnswer.add(genre.songList.get(0).songIndex);
                i++;
            }
        }
        
        for(int index : forAnswer){
            System.out.println(index);
        }
        
        answer=new int[forAnswer.size()];
        for(int k=0; k<forAnswer.size(); k++){
            answer[k] = forAnswer.get(k);
        }
        
        
        return answer;
    }
    
    class Genre implements Comparable<Genre>{
        String genre;
        ArrayList<Song> songList;
        int totalCount;
        
        Genre(String genre){
            this.genre = genre;
            songList = new ArrayList<>();
            totalCount = 0;
        }
        public void addSong(Song song){
            totalCount+=song.playCount;
            songList.add(song);
            Collections.sort(songList);
        }
        
        public String toString(){
            System.out.println(genre+", 총시간 : "+totalCount);
            for(Song song : this.songList){
                System.out.print(song+" ");
            }
            System.out.println();
            
            return "";
        }
        
        @Override
        public int compareTo(Genre g){
            return Integer.compare(g.totalCount, this.totalCount);
        }
    }
    
    class Song implements Comparable<Song>{
        int songIndex;
        int playCount;
        
        Song(int songIndex, int playCount){
            this.songIndex = songIndex;
            this.playCount = playCount;
        }
        
        @Override
        public int compareTo(Song s){
            if(this.playCount == s.playCount){
                if(this.songIndex > s.songIndex) return 1;
                else return -1;
            }
            else if(this.playCount < s.playCount) return 1;
            else return -1;
            
        }
        
        public String toString(){
            return "인덱스 : "+songIndex+", 플레이 횟수 : "+playCount+ " / ";
        }
    }
	
	
	
//	// 일단 버린 코드2..
//	public int[] solution2(String[] genres, int[] plays) {
//		int[] answer;
//
//		HashMap<String, Genre> hm = new HashMap<>();
//
//		// 일단 들어 오는 곡들
//		for (int i = 0; i < genres.length; i++) {
//			System.out.println(genres[i] + " " + plays[i]);
//		}
//		System.out.println();
//
//		for (int i = 0; i < genres.length; i++) {
//			if (!hm.containsKey(genres[i])) {
//				Genre now = new Genre(genres[i]);
//				now.addSong(new Song(i, plays[i]));
//				hm.put(genres[i], now);
//
//				System.out.println(now);
//
//			} else {
//				Genre now = hm.get(genres[i]);
//				now.addSong(new Song(i, plays[i]));
//				hm.put(genres[i], now);
//
//				System.out.println(now);
//			}
//		}
//
//		ArrayList<Genre> genreList = new ArrayList<>();
//
//		for (String key : hm.keySet()) {
//			System.out.println(key);
//			genreList.add(hm.get(key));
//		}
//		Collections.sort(genreList);
//		System.out.println("=================");
//
//		answer = new int[genreList.size() * 2];
//		int i = 0;
//		for (Genre genre : genreList) {
//			System.out.println(genre);
//			if (genre.songList.size() >= 2) {
//				answer[i] = genre.songList.get(0).songIndex;
//				answer[i + 1] = genre.songList.get(1).songIndex;
//				i += 2;
//			} else {
//				answer[i] = genre.songList.get(0).songIndex;
//				i++;
//			}
//		}
//
//		return answer;
//	}
//
//	class Genre implements Comparable<Genre> {
//		String genre;
//		ArrayList<Song> songList;
//		int totalCount;
//
//		Genre(String genre) {
//			this.genre = genre;
//			songList = new ArrayList<>();
//			totalCount = 0;
//		}
//
//		public void addSong(Song song) {
//			totalCount += song.playCount;
//			songList.add(song);
//			Collections.sort(songList);
//		}
//
//		public String toString() {
//			System.out.println(genre + ", 총시간 : " + totalCount);
//			for (Song song : this.songList) {
//				System.out.print(song + " ");
//			}
//			System.out.println();
//
//			return "";
//		}
//
//		@Override
//		public int compareTo(Genre g) {
//			return Integer.compare(g.totalCount, this.totalCount);
//		}
//	}
//
//	class Song implements Comparable<Song> {
//		int songIndex;
//		int playCount;
//
//		Song(int songIndex, int playCount) {
//			this.songIndex = songIndex;
//			this.playCount = playCount;
//		}
//
//		@Override
//		public int compareTo(Song s) {
//			return Integer.compare(s.playCount, this.playCount);
//		}
//
//		public String toString() {
//			return "인덱스 : " + songIndex + ", 플레이 횟수 : " + playCount + " / ";
//		}
//	}
//	
//	
//	// 일단 버린 코드1..
//	public int[] solution(String[] genres, int[] plays) {
//		int[] answer = {};
//
//		HashMap<String, Song> hm = new HashMap<>();
//
//		for (int i = 0; i < genres.length; i++) {
//			System.out.println(genres[i] + " " + plays[i]);
//
//			if (!hm.containsKey(genres[i])) {
////				hm.put(genres[i], new Song(genres[i], i));
//			} else {
//				Song thisSong = hm.get(genres[i]);
//			}
//
//		}
//
//		return answer;
//	}

//	class Song {
//		String playIndexList;
//		int totalPlayCount;
//
//		public
//
//		Song(String playIndexList, int totalPlayCount) {
//			this.playIndexList = playIndexList;
//			this.totalPlayCount = totalPlayCount;
//		}
//
//		public String toString() {
//			return "플레이리스트 : " + playIndexList + ", 총플레이시간 : " + totalPlayCount;
//		}
//	}

	
}
