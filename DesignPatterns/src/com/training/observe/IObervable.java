package com.training.observe;

public interface IObervable {
  void addUser(IObserver obs);
  void remove(IObserver obs);
  void notifyObserver();
}
