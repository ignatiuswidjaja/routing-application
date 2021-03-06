package com.example.routing.model.result;

import com.example.routing.model.Station;
import com.example.routing.model.enums.TimePeriod;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(force = true)
@AllArgsConstructor
@Builder(builderClassName = "Builder")
@Getter
public class ShortestRouteWithTimeResult {
  private final List<Station> stations;
  private final int totalTravelTimeInMinutes;
  private final TimePeriod timePeriod;
}
