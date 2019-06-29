package ekko.wepark.message.commands.notification;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.axonframework.commandhandling.TargetAggregateIdentifier;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeleteNotificationCommand {
    @TargetAggregateIdentifier
    private String notificationId;
}
