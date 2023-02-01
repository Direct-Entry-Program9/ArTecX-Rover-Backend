package lk.artech.backend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class User implements SuperEntity{
    private String username;
    private int currentX;
    private int currentY;
    private String command;
}
