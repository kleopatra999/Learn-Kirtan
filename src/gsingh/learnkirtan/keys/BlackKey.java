package gsingh.learnkirtan.keys;

import static gsingh.learnkirtan.Constants.BLACK_KEY_HEIGHT;
import static gsingh.learnkirtan.Constants.BLACK_KEY_WIDTH;

import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;

@SuppressWarnings("serial")
public class BlackKey extends Key {

	/**
	 * Font to use for note labels
	 */
	private static Font font = new Font("Dialog", Font.PLAIN, 9);

	/**
	 * Smaller font for Dha
	 */
	private static Font dhaFont = new Font("Dialog", Font.PLAIN, 7);

	public BlackKey(LabelManager labelManager) {
		super(labelManager);
		setBackground(Color.BLACK);
		setForeground(Color.WHITE);
		setMargin(new Insets(0, 0, 0, 0));
		setFont(font);
		if (getText().contains("Dha")) {
			setFont(dhaFont);
		}
		setSize(BLACK_KEY_WIDTH, BLACK_KEY_HEIGHT);
	}
}
