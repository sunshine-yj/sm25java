package eud.sm.dto;

import lombok.*;

import java.time.LocalTime;
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class cust {
    private String custId;
    private String custPwd;
    private String custName;
    private LocalTime custRegdate;
    private LocalTime custUpdate;
}
