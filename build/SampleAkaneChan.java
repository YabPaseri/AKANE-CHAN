import com.gmail.yabpaseri.akane_chan.AkaneChan;
import com.gmail.yabpaseri.akane_chan.ListenUpAkaneChanSampleContents;

public class SampleAkaneChan {
	public static void main(String[] args) {
		System.out.println("name, agree, meaning_jp, meaning_en");
		for(AkaneChan value : AkaneChan.values()) {
			System.out.println(String.format("%s, %b, %s, %s",
					value.name(),
					value.isAgree(),
					value.getMeaning_jp(),
					value.getMeaning_en())
			);
		}

		System.out.println(AkaneChan.ListenUpAkaneChan(
				ListenUpAkaneChanSampleContents.jp_FamousStreamer).getMeaning_jp());
		System.out.println(AkaneChan.ListenUpAkaneChan(
				ListenUpAkaneChanSampleContents.jp_GreatIdea).getMeaning_jp());
		System.out.println(AkaneChan.ListenUpAkaneChan(
				ListenUpAkaneChanSampleContents.jp_GuitarSolo).getMeaning_jp());
		System.out.println(AkaneChan.ListenUpAkaneChan(
				ListenUpAkaneChanSampleContents.jp_HowDidItSound).getMeaning_jp());
		System.out.println(AkaneChan.ListenUpAkaneChan(
				ListenUpAkaneChanSampleContents.jp_WhatDoYouThink).getMeaning_jp());
	}
}
