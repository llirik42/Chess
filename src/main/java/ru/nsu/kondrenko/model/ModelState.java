package ru.nsu.kondrenko.model;

public enum ModelState {
    MAIN_MENU_CHOICE,
    SHOWING_HELP,
    SHOWING_SCORE_TABLE,
    QUITING,
    STARTED_SINGLEPLAYER,
    STARTED_MULTIPLAYER,
    ENTERING_NAME_OF_SINGLE_PLAYER,
    ENTERING_COLOR_OF_SINGLE_PLAYER,
    ENTERING_NAME_OF_WHITE_PLAYER,
    ENTERING_NAME_OF_BLACK_PLAYER,
    SAME_NAMES,
    INCORRECT_CHOICE,
    INCORRECT_MOVE,
    WAITING_ON_MOVE,
    INCORRECT_PLAYER_NAME,
    START_OF_GAME,
    COLOR_NOT_SELECTED,
    RESTARTING_GAME,
    DRAW,
    MATE
}
