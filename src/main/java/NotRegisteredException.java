public class NotRegisteredException extends RuntimeException {
    public NotRegisteredException(String id) {
        super("Игрок с  id:" + id + "не найден");
    }

}
