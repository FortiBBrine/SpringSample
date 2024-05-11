package me.fortibrine.springsample.security

import me.fortibrine.springsample.models.MyUser
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.security.core.userdetails.UserDetails

class MyUserDetails(
    val user: MyUser
): UserDetails {
    override fun getAuthorities(): MutableCollection<out GrantedAuthority> {
        return user.roles.split(", ").map { it -> SimpleGrantedAuthority(it) }.toMutableList()
    }

    override fun getPassword() = user.password
    override fun getUsername() = user.name
    override fun isAccountNonExpired() = true
    override fun isAccountNonLocked() = true
    override fun isCredentialsNonExpired(): Boolean = true
    override fun isEnabled(): Boolean = true
}