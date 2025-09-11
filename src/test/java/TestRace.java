import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRace {

    @Test
    @DisplayName("4이상 일때만 전진하는지 확인")
    void CarMove(){
        //given
        Car f1 = new Car("f1");
        //when
        f1.move(4);
        //then
        assertThat(f1.getPosition()).isEqualTo(1);
    }

    void CarStop(){
        //given
        Car f1 = new Car("f1");
        //when
        f1.move(3);
        //then
        assertThat(f1.getPosition()).isEqualTo(0);
    }
}