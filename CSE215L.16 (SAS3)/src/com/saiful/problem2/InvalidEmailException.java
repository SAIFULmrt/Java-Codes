package com.saiful.problem2;

class InvalidEmailException extends Exception {
  private static final long serialVersionUID = 1039672875833585185L;

  public InvalidEmailException() {
  }

  public InvalidEmailException(String message) {
    super(message);
  }

}