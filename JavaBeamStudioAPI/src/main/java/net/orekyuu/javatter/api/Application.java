package net.orekyuu.javatter.api;

import javafx.stage.Stage;

/**
 * 
 * �A�v���P�[�V������\���C���^�[�t�F�[�X
 *
 */
public interface Application {
	/**
	 * �A�v���P�[�V�����J�n���ɌĂяo����܂��B<br>
	 * ���̃��\�b�h��JavaFX�A�v���P�[�V�����X���b�h�ŌĂяo����܂��B
	 * 
	 * @param args
	 *            ���s������
	 */
	void onStart(String[] args);
	/**
	 * ���[�h�������s���܂��B<br>
	 * ���̃��\�b�h��onStart�̂��ƂɌĂяo����ăo�b�N�O���E���h�X���b�h�œ��삵�܂��B
	 */
	void onLoad();
	/**
	 * onLoad()�̏������I�������ɌĂяo����āAJavaFX�A�v���P�[�V�����X���b�h�œ��삵�܂��B
	 * @param primaryStage primaryStage
	 */
	void onCreate(Stage primaryStage);

}
