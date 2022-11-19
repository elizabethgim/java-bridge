package bridge;

import camp.nextstep.edu.missionutils.Console;

/**
 * 사용자로부터 입력을 받는 역할을 한다.
 */
public class InputView {

    /**
     * 다리의 길이를 입력받는다.
     */
    public int readBridgeSize() {
        return Integer.parseInt(Console.readLine());
    }

    /**
     * 사용자가 이동할 칸을 입력받는다.
     */
    public String readMoving() {
        System.out.println("이동할 칸을 선택해주세요. (위: U, 아래: D)");
        String move = Console.readLine().strip();
        checkNull(move);
        checkWrongMove(move);
        return move;
    }

    private static void checkNull(String userInput){
        if(userInput.length() == 0){
            throw new RuntimeException("[Error] 아무것도 입력하지 않았습니다. ");
        }
    }

    private static void checkWrongMove(String move){
        if(!move.equals("U") && !move.equals("D")){
            throw new RuntimeException("[Error] 잘못된 이동입니다.");
        }
    }
    /**
     * 사용자가 게임을 다시 시도할지 종료할지 여부를 입력받는다.
     */
    public String readGameCommand() {
        String command = Console.readLine().strip();
        checkNull(command);
        checkWrongGameCommand(command);
        return command;
    }

    private static void checkWrongGameCommand(String command) {
        if(command.strip().length() > 0){
            throw new RuntimeException("[Error] 잘못된 커맨드를 입력하셨습니다. 다시 입력해주세요.");
        }
    }
}
