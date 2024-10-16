public class commands {// Интерфейс команды
    interface Command {
        void execute();
    }

    // Класс телевизора, который выполняет реальные действия
    class Television {
        private int volume = 10;
        private int channel = 1;

        public void turnOn() {
            System.out.println("Телевизор включен.");
        }

        public void turnOff() {
            System.out.println("Телевизор выключен.");
        }

        public void volumeUp() {
            if (volume < 100) {
                volume++;
                System.out.println("Громкость увеличена. Текущая громкость: " + volume);
            } else {
                System.out.println("Максимальная громкость.");
            }
        }

        public void volumeDown() {
            if (volume > 0) {
                volume--;
                System.out.println("Громкость уменьшена. Текущая громкость: " + volume);
            } else {
                System.out.println("Минимальная громкость.");
            }
        }

        public void nextChannel() {
            channel++;
            System.out.println("Смена на следующий канал. Текущий канал: " + channel);
        }

        public void previousChannel() {
            if (channel > 1) {
                channel--;
                System.out.println("Смена на предыдущий канал. Текущий канал: " + channel);
            } else {
                System.out.println("Первый канал.");
            }
        }
    }

    // Конкретные команды
    class TurnOnCommand implements Command {
        private Television tv;

        public TurnOnCommand(Television tv) {
            this.tv = tv;
        }

        @Override
        public void execute() {
            tv.turnOn();
        }
    }

    class TurnOffCommand implements Command {
        private Television tv;

        public TurnOffCommand(Television tv) {
            this.tv = tv;
        }

        @Override
        public void execute() {
            tv.turnOff();
        }
    }

    class VolumeUpCommand implements Command {
        private Television tv;

        public VolumeUpCommand(Television tv) {
            this.tv = tv;
        }

        @Override
        public void execute() {
            tv.volumeUp();
        }
    }

    class VolumeDownCommand implements Command {
        private Television tv;

        public VolumeDownCommand(Television tv) {
            this.tv = tv;
        }

        @Override
        public void execute() {
            tv.volumeDown();
        }
    }

    class NextChannelCommand implements Command {
        private Television tv;

        public NextChannelCommand(Television tv) {
            this.tv = tv;
        }

        @Override
        public void execute() {
            tv.nextChannel();
        }
    }

    class PreviousChannelCommand implements Command {
        private Television tv;

        public PreviousChannelCommand(Television tv) {
            this.tv = tv;
        }

        @Override
        public void execute() {
            tv.previousChannel();
        }
    }

    // Пульт управления, который хранит команды и может их выполнять
    class RemoteControl {
        private Command[] buttons;

        public RemoteControl() {
            buttons = new Command[6]; // 6 кнопок на пульте
        }

        public void setCommand(int buttonIndex, Command command) {
            if (buttonIndex >= 0 && buttonIndex < buttons.length) {
                buttons[buttonIndex] = command;
            }
        }

        public void pressButton(int buttonIndex) {
            if (buttonIndex >= 0 && buttonIndex < buttons.length && buttons[buttonIndex] != null) {
                buttons[buttonIndex].execute();
            } else {
                System.out.println("Кнопка не настроена.");
            }
        }
    }
    // Главный класс для тестирования работы
    public class Main {
        public void main(String[] args) {
            // Создаем телевизор
            Television tv = new Television();

            // Создаем команды для телевизора
            Command turnOn = new TurnOnCommand(tv);
            Command turnOff = new TurnOffCommand(tv);
            Command volumeUp = new VolumeUpCommand(tv);
            Command volumeDown = new VolumeDownCommand(tv);
            Command nextChannel = new NextChannelCommand(tv);
            Command previousChannel = new PreviousChannelCommand(tv);

            // Создаем пульт управления
            RemoteControl remote = new RemoteControl();

            // Настраиваем кнопки пульта
            remote.setCommand(0, turnOn); // кнопка 0 - включить
            remote.setCommand(1, turnOff); // кнопка 1 - выключить
            remote.setCommand(2, volumeUp); // кнопка 2 - увеличить громкость
            remote.setCommand(3, volumeDown); // кнопка 3 - уменьшить громкость
            remote.setCommand(4, nextChannel); // кнопка 4 - следующий канал
            remote.setCommand(5, previousChannel); // кнопка 5 - предыдущий канал

            // Тестируем команды через пульт
            remote.pressButton(0); // Включить телевизор
            remote.pressButton(2); // Увеличить громкость
            remote.pressButton(4); // Следующий канал
            remote.pressButton(5); // Предыдущий канал
            remote.pressButton(3); // Уменьшить громкость
            remote.pressButton(1); // Выключить телевизор
        }
    }

}

