package com.example.demo.object;

import com.example.demo.model.Car;
import com.example.demo.model.Event;
import com.example.demo.model.EventReward;
import lombok.Data;

import java.util.List;

/*****
 *@className: EventParam
 *@date: 2021/4/25  17:55
 *@User: create By haha
 *
 */

@Data
public class EventParam extends Event {

    private List<Car> cars;

    private List<EventReward> eventRewards;
}
