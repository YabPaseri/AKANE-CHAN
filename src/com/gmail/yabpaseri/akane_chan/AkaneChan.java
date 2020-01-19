package com.gmail.yabpaseri.akane_chan;

/**
 * @author YabPaseri
 */
public enum AkaneChan {
	/**
	 * <div>JP: あほくさ</div>
	 * <div>EN: Sounds stupid</div>
	 */
	Ahokusa(false, "Sounds stupid.", "あほくさ"),

	/**
	 * <div>JP: あれな</div>
	 * <div>EN: Exactly...</div>
	 */
	Arena(true, "Exactly...", "あれな"),

	/**
	 * <div>JP: ええで</div>
	 * <div>EN: Sure.</div>
	 */
	Ede(true, "Sure.", "ええで"),

	/**
	 * <div>JP: ええんちゃう？</div>
	 * <div>EN: Not bad.</div>
	 */
	Enchau(true, "Not bad.", "ええんちゃう？"),

	/**
	 * <div>JP: ほんま</div>
	 * <div>EN: Real talk...</div>
	 */
	Honma(true, "Real talk...", "ほんま"),

	/**
	 * <div>JP: せやな</div>
	 * <div>EN: Right on...</div>
	 */
	Seyana(true, "Right on...", "せやな"),

	/**
	 * <div>JP: 知らんがな</div>
	 * <div>EN: I really don't care.</div>
	 */
	Shirangana(false, "I really don't care.", "知らんがな"),

	/**
	 * <div>JP: 知らんけど</div>
	 * <div>EN: But what do I know?</div>
	 */
	Shirankedo(false, "But what do I know?", "知らんけど"),

	/**
	 * <div>JP: それな</div>
	 * <div>EN: Sounds good...</div>
	 */
	Sorena(true, "Sounds good...", "それな"),

	/**
	 * <div>JP: そやな</div>
	 * <div>EN: You're right...</div>
	 */
	Soyana(true, "You're right...", "そやな"),

	/**
	 * <div>JP: わかる</div>
	 * <div>EN: I feel you.</div>
	 */
	Wakaru(true, "I feel you.", "わかる"),
	;

	/**
	 * <div>意味が賛成よりか，反対よりか</div>
	 * <div>Whether the meaning of a word is for or against.</div>
	 */
	private boolean agree;

	/**
	 * <div>単語の意味(日本語)</div>
	 * <div>The meaning of a word(Japanese).</div>
	 */
	private String meaning_jp;

	/**
	 * <div>単語の意味(英語)</div>
	 * <div>The meaning of a word(English).</div>
	 */
	private String meaning_en;

	private AkaneChan(boolean agree, String meaning_en, String meaning_jp) {
		this.agree = agree;
		this.meaning_en = meaning_en;
		this.meaning_jp = meaning_jp;
	}

	/**
	 * <div>単語の意味が賛成か反対かを返す</div>
	 * <div>Return whether the meaning of a word is for or against.</div>
	 * @return
	 * 		<div>意味が賛成であればtrue</div>
	 * 		<div>true if the meaning of a word is agree.</div>
	 */
	public boolean isAgree() {
		return this.agree;
	}

	/**
	 * <div>単語の意味(英語)を返す</div>
	 * <div>Return the meaning of a word(English).</div>
	 * @return
	 * 		<div>単語の意味(英語)</div>
	 * 		<div>The meaning of a word(English).</div>
	 */
	public String getMeaning_en() {
		return this.meaning_en;
	}

	/**
	 * <div>単語の意味(日本語)を返す</div>
	 * <div>Return the meaning of a word(Japanese).</div>
	 * @return
	 * 		<div>単語の意味(日本語)</div>
	 * 		<div>The meaning of a word(Japanese).</div>
	 */
	public String getMeaning_jp() {
		return meaning_jp;
	}

	/**
	 * <div>アカネチャンが話を聞いてくれます．</div>
	 * <div>Akane-chan will listen to you.</div>
	 * @param content
	 * 		<div>話の内容</div>
	 * 		<div>The content.</div>
	 * @return
	 * 		<div>登録された文字列と一致しない場合はAkaneChan.Shiranganaが返ってきます</div>
	 * 		<div>If the argument does not match the registered text, AkaneChan.Shirangana will be returned.</div>
	 */
	public static AkaneChan ListenUpAkaneChan(String content) {
		if (content.equals("私有名実況者になります！")) {
			return Seyana;
		}
		else if (content.equals("I will become a famous streamer!")) {
			return Seyana;
		}
		else if (content.equals("ね！いい考えでしょ！アカネチャン！")) {
			return Wakaru;
		}
		else if (content.equals("Well? It's a great idea, Am I right? Akane-chan?")) {
			return Wakaru;
		}
		else if (content.equals("私のギターソロを聴いてよアカネチャン！")) {
			return Ede;
		}
		else if (content.equals("Listen to my guitar solo, Akane-chan!")) {
			return Ede;
		}
		else if (content.equals("どうかな！？アカネチャン！！")) {
			return Enchau;
		}
		else if (content.equals("Akane-chan!! How did it sound!?")) {
			return Enchau;
		}
		else if (content.equals("ね！？！？そう思うでしょ！？！？！？！アカネチャン！！！！！！！")) {
			return Ahokusa;
		}
		else if (content.equals("Well!?!? What do you think!?!?!? Akane-chan!!!!!!")) {
			return Ahokusa;
		}
		else {
			return Shirangana;
		}
	}
}
