package de.iav.mucjave231burgershop.exception;

import java.util.NoSuchElementException;

public class MenueNotFoundException extends NoSuchElementException {
public MenueNotFoundException(String id) {super("Menue nicht gefunden");}
}
