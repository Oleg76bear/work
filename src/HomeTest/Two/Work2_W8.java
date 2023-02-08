//Çàäà÷à 8:
//Íåîáõîäèìî èçâëå÷ü èç ñòðîêè è ðàñïå÷àòàòü íîìåð êàðòû
//(XXXX-XXXX-XXXX-XXXX) åñëè îí òàì åñòü.

package HomeTest.Two;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Work2_W8 {

    public static void main(String[] args) {
        String card = "Íà÷èíàåòñÿ íîâàÿ ïðîãðàììà ñ òîãî, ÷òî íà ñöåíó âûéäåò ìàëü÷èê è ñòàíåò â  ïëàíøåòå âûáèðàòü ñåáå èãðó. Ñðåäè óæå çíàêîìûõ è íå ðàç ñûãðàííûõ åìó ïîïàäåòñÿ èãðà «Ðèòìû àòàìàíà». Îí ðåøàåò îòêðûòü åå… Ââåäèòå íîìåð êàòðû: 0678-7890-3456-9076.";
       Pattern p = Pattern.compile("\\d{4}([-]|)\\d{4}([-]|)\\d{4}([-]|)\\d{4}");
        Matcher m = p.matcher(card);
        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
